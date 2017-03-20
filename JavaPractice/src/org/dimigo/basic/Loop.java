/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop.java
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author : jjjj
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int menu,atk=100;
		String[] c = {"마법사","영주","기사","농민"};
		Random random = new Random();
		Scanner scanner=new Scanner(System.in);
		do{
			System.out.printf("-------------------\n<< 게임 메뉴 >> \n1. 공격력 증가 \n2. 공격력 감소 \n3. 캐릭터 설정 \n9. 종료 \n-------------------\n메뉴 입력 => ");
			menu=scanner.nextInt();
			switch(menu)
			{
			case 1:
				atk+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+atk);
				break;
			case 2:
				atk-=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+atk);
				break;
			case 3:
				System.out.println(c[random.nextInt(4)]+"(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				scanner.close();
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
		}while(menu!=9);

	}

}
