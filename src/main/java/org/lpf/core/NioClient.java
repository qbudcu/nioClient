package org.lpf.core;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.lpf.handler.IHandler;
import org.lpf.proto.MsgClient.ReqRegisterClient;
import org.lpf.utils.BitConverter;

import com.google.protobuf.GeneratedMessage;

public class NioClient {
	private String ip;
	private int port;
	private static Selector selector;
	private ExecutorService executorService;
	private ByteBuffer buffer;
	private static int DEFAULT_BUFFERSIZE = 1024;//默认缓冲区大小为1024字节
	
	public NioClient(String ip,int port){
		this.ip = ip;
		this.port = port;
		executorService  = Executors.newCachedThreadPool();
		this.buffer = ByteBuffer.allocate(DEFAULT_BUFFERSIZE);
	}
	
	public void connect() throws IOException{
		if(selector == null)  
		    selector = Selector.open();  
		SocketChannel channel = SocketChannel.open();  
		channel.configureBlocking(false);  
		channel.connect(new InetSocketAddress(ip, port));  
		channel.register(selector, SelectionKey.OP_CONNECT);
		new Thread(new Runnable() {
			public void run() {
				while(true){
					try {
						int count = selector.select();
						if (count == 0)
							continue;
						Set<SelectionKey> keys = selector.selectedKeys();
						Iterator<SelectionKey> iterator = keys.iterator();
						while(iterator.hasNext()){
							SelectionKey key = iterator.next();
							iterator.remove();
							handleKey(key);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
			}
		}).start();
	}
	
	public void handleKey(SelectionKey key) throws IOException{
		 if (key.isConnectable()){
			 SocketChannel socketChannel = (SocketChannel) key.channel();
			 if (socketChannel.isConnectionPending())
				 socketChannel.finishConnect();
			 socketChannel.register(selector, SelectionKey.OP_READ);
		 }
		 if (key.isReadable()){
			 receiveData(key);
		 }
	}
	
	public void receiveData(SelectionKey key) throws IOException{
		SocketChannel channel = (SocketChannel) key.channel();
        int count = channel.read(buffer);
        if (count > 0) 
        {
      	 byte[] recieve_data = buffer.array();
      	 byte[] codeBytes = new byte[4];
       	 byte[] lengthBytes = new byte[4];
       	 System.arraycopy(recieve_data, 0, codeBytes, 0, 4);
       	 System.arraycopy(recieve_data, 4, lengthBytes, 0, 4);
       	 int code = BitConverter.bytesToInt(codeBytes);
       	 int length = BitConverter.bytesToInt(lengthBytes);
       	 byte[] data = new byte[length];
       	 System.arraycopy(recieve_data, 8, data, 0, length);
       	 IHandler handler = HandlerManager.getInstance().getHandler(code);
       	 handler.setMsgData(data);
       	 //任务交给线程池异步执行
       	 executorService.submit(handler);
        }
        buffer.clear();
	}
	
	public static void sendMsg(SocketChannel socket, int code, GeneratedMessage info) throws IOException{
		 byte[] data = info.toByteArray();
		 byte[] send_datas = new byte[data.length+8];
		 byte[] msg_code = BitConverter.intToBytes(code);
		 byte[] length = BitConverter.intToBytes(data.length);
		 System.arraycopy(msg_code, 0, send_datas, 0, 4);
		 System.arraycopy(length, 0, send_datas, 4, 4);
		 System.arraycopy(data, 0, send_datas, 8, data.length);
		 socket.write(ByteBuffer.wrap(send_datas));
		 //System.out.println(socketChannel.socket().getSendBufferSize());
		 System.out.println("data sent. Message code: "+code);
	}
}
