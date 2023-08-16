package edu.kh.oarr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("456.456.456.456", "고길동"));
		ipInfoList.add(new IPInfo("789.789.789.789", "김길동"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i = 0; i<ipInfoList.size(); i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {
				System.out.println(ipInfoList.get(i));
				return;
			}
		}
		System.out.println("일치하는 ip 사용자가 없습니다.");
		
	}
}
