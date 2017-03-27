/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest.java
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : jjjj
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1,c2,c3;
		c1=new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		c2=new Car3("기아자동차", "K7", "흰색", 246);
		c3=new Car3("삼성자동차", "SM7", "회색");
		
//		c1.setCompany("현대자동차");
//		c1.setModel("제네시스");
//		c1.setColor("검정색");
//		c1.setMaxSpeed(225);
//		c1.setPrice(50000000);
//		
//		c2.setCompany("기아자동차");
//		c2.setModel("K7");
//		c2.setColor("흰색");
//		c2.setMaxSpeed(246);
//		c2.setPrice(40000000);
//		
//		c3.setCompany("삼성자동차");
//		c3.setModel("SM7");
//		c3.setColor("회색");
//		c3.setMaxSpeed(200);
//		c3.setPrice(38000000);
		
		System.out.println("<<자동차 목록>>");
		c1.print();
		System.out.println();
		c2.print();
		System.out.println();
		c3.print();

	}

}
