package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Friend[] InfoArray = new Friend[3];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요.");
		
		
		
		for(int j = 0; j<InfoArray.length; j++) {
			
			String[] info = sc.nextLine().split(" ");
			
			InfoArray[j] = new Friend(info[0], info[1], info[2]);
			
		}
		
		for(int i = 0; i<InfoArray.length; i++) {
			InfoArray[i].showInfo();
		}

		sc.close();

	}

}
