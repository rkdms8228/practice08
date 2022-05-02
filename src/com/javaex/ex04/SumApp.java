package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요.");
		int numLine = sc.nextInt();

		//코드를 작성하세요
		String blank = String.valueOf(" ");
		String[] nArray = blank.split(" ");
		
		
		
		for(int i = 0; i<nArray.length; i++) {
			sum = Integer.parseInt(nArray[i]);
			sum = numLine + sum;
			System.out.println("합:" + sum);
		}
		
		sc.close();
	}

}
