package com.javaex.ex05;

public class Div {

	//필드
    private int a;
    private int b;
    
    //생성자
    public void setValue() {
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    //메소드-일반
    public int calculate() {
    	return a/b;
    }

}
