/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question.java
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : jjjj
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] answer = {"빅뱅","공유","응용 프로그래밍"};
		String[] question = {"가장 좋아하는 가수는? ","가장 좋아하는 배우는? ","가장 좋아하는 과목은? "};
		String in = "";
		StringBuilder[] print = new StringBuilder[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%d.%s\n",i+1,question[i]);
			in = sc.nextLine();
			System.out.println((answer[i].equals(in))? "정답입니다!":"틀렸습니다!");
		}
		System.out.println("<<결과 출력>>");
		for(int i=0;i<3;i++)
		{
			print[i] = new StringBuilder("");
			print[i].append(question[i]).append(answer[i]).append("입니다.");
			System.out.println(print[i]);
		}
		sc.close();

	}

}
