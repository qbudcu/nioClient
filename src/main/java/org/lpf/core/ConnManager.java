package org.lpf.core;

import java.util.HashMap;

public class ConnManager {
	private static ConnManager instance = new ConnManager();
	private ConnManager(){
	}
	public static ConnManager getInstance(){
		return instance;
	}
	
	private HashMap<String, NioClient> clients = new HashMap<String, NioClient>();
	
	public NioClient getClient(String ip,int port){
		String key = buildKey(ip, port);
		if (clients.containsKey(key))
			return clients.get(key);
		NioClient client = new NioClient(ip, port);
		clients.put(key, client);
		return client;
	}
	
	public String buildKey(String ip,int port){
		return ip+port;
	}
	
	public void removeClient(String ip,int port){
		String key = buildKey(ip, port);
		if (clients.containsKey(key))
			clients.remove(key);
	}
}
