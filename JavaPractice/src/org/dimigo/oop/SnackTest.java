/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest.java
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 * @author : jjjj
 * @version : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snacks = new Snack[3];
		snacks[0]=new Snack("새우깡","농심",1100,2);
		snacks[1]=new Snack("콘칲","크라운",1200,1);
		snacks[2]=new Snack("허니버터칩","해태",1500,4);
		
		for(Snack snack : snacks)
		{
			System.out.println(snack);
		}
		
		System.out.println("총 구매 금액 : "+String.format("%,d", snacks[0].getPrice()*snacks[0].getNumber() + snacks[1].getPrice()*snacks[1].getNumber() + snacks[2].getPrice()*snacks[2].getNumber())+"원");

	}

}
