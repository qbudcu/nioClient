package org.lpf.handler.impl;

import java.io.IOException;

import org.lpf.core.ConnManager;
import org.lpf.handler.IHandler;
import org.lpf.proto.MsgClient.ReqRegisterClient;
import org.lpf.proto.MsgClient.ResConnectCreate;
import org.lpf.proto.MsgCode.GameCode;

public class ResClientCreateHandler implements IHandler{
	private ResConnectCreate res;
	public void init(Object[] obj) {
		// TODO Auto-generated method stub
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ResConnectCreateHandler excuted.");
		ReqRegisterClient.Builder req = ReqRegisterClient.newBuilder();
		req.setClientId("1234567");
		ReqRegisterClient info = req.build();
		try {
			ConnManager.getInstance().getClient("localhost", 6018).sendMsg(GameCode.REQ_REGISTER_CLIENT.getNumber(), info);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int msgCode() {
		return GameCode.RES_CLIENT_CREATE.getNumber();
	}

	public void setMsgData(byte[] data) throws IOException {
		res = ResConnectCreate.parseFrom(data);
	}
}
