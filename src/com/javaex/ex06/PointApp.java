package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		//object 클래스가 원래 존재하기 때문이다.
		//object 클래스에는 equals 메소드가 있기 때문에 출력에 equals을 넣어도 오류가 없다.
		//단, ==와 equals은 엄연히 다르기에 주의해야 한다.
		//==은 주소값만을 비교하고
		//하지만 equals는 메소드에서 값을 비교할 수 있도록 설정하여 비교를 하면 동일 값을 파악한다.
	}

}


