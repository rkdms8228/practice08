package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Friend[] InfoArray = new Friend[3];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요.");
		
		
		
		for(int j = 0; j<InfoArray.length; j++) {
			
			String info = sc.nextLine();
			
			String[] iArray = new String[3];
				
			iArray = info.split(" ");
			
			InfoArray[j].setName(iArray[0]);
			InfoArray[j].setPh(iArray[1]);
			InfoArray[j].setSchool(iArray[2]);
			
			InfoArray[j].showInfo();

		}
		

		sc.close();

	}

}
