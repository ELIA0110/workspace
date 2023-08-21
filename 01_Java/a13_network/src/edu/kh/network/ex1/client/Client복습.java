package edu.kh.network.ex1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client복습 {

	public void start() {
		
		String ip = "192.168.10.19";
		int port = 8500;
		
		Socket socket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("클라이언트 입니다.");
			
			if(socket != null) {
				
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(is));
				pw = new PrintWriter(os);
				
				String serverMessage = br.readLine();
				System.out.println(serverMessage);
				
				Scanner sc = new Scanner(System.in);
				String clientMessage = sc.nextLine();
				
				pw.println(clientMessage);
				pw.flush();
				
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				
				if(socket != null) socket.close();
			
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}
