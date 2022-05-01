package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print(">> ");
    	String cal = sc.nextLine();
    	
    	cal.trim();
    	
    	int a, b;
    	
    	String[] cArray = new String[3];
    	cArray[0] = a;
    	cArray[2] = b;
    	
    	switch(cArray[1]) {
			case "+":
				Add add = new Add();
				System.out.println(">> "+add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				System.out.println(">> "+sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				System.out.println(">> "+mul.calculate());
				break;
			case "/":
				Div div = new Div();
				System.out.println(">> "+div.calculate());
				break;
			case "/q":
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("알 수 없는 연산입니다.");
				break;
	}
    	
    	sc.close();

    }
}
