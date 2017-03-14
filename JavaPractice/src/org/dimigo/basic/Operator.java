/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator.java
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author : jjjj
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1700000;
		int b = 3;
		int c = 1500;
		System.out.println(String.format("월 평균 급여 : %,d원",a));
		System.out.println(String.format("점포 내 직원 수 : %,d명", b));
		System.out.println(String.format("점포 수 : %,d개", c));
		System.out.println();
		System.out.println(String.format("연간 인건비 : %,d원", (long)a*12*b*c));

	}

}
