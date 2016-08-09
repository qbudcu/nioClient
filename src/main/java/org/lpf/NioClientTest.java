package org.lpf;

import java.io.IOException;
import java.util.Scanner;

import org.lpf.core.ConnManager;
import org.lpf.core.NioClient;

public class NioClientTest {
	public static void main(String[] args) throws IOException {
		ConnManager.getInstance().getClient("localhost", 6018).connect();	
		Scanner scanner = new Scanner(System.in);
	}
}
