package org.lpf;

import java.io.IOException;
import java.util.Scanner;

import org.lpf.core.NioClient;

public class NioClientTest {

	public static void main(String[] args) throws IOException {
		NioClient client = new NioClient("localhost", 6018);
		client.connect();
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			
		}
	}
}
