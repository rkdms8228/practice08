package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print(">> ");
    	String cal = sc.nextLine();
    	
    	String[] cArray = cal.split(" ");
    	
    	int a, b;
    	
    	a = Integer.parseInt(cArray[0]);
    	b = Integer.parseInt(cArray[2]);

    	
    	switch(cArray[1]) {
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(">> "+add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(">> "+sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(">> "+mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
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
