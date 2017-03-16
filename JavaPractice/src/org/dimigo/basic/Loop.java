/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 *<pre>
 * org.dimigo.basic
 *   |_ Loop
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice;
		int i = 100;
		Scanner scanner = new Scanner(System.in);
		String[] character = {"마법사", "영주", "기사", "농민"};
		
		do{
			System.out.print("-------------\n");
			System.out.print("<<게임 메뉴>>\n");
			System.out.print("1. 공격력 증가\n");
			System.out.print("2. 공격력 감소\n");
			System.out.print("3. 캐릭터 설정\n");
			System.out.print("9. 종료\n");
			System.out.print("-------------\n");
			System.out.print("메뉴 입력 => ");
			choice = scanner.nextInt();
			int R=new Random().nextInt(4);
			switch(choice){
			case 1:
				i +=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + i);
				break;
			case 2:
				i-= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + i);
				break;
			case 3:
					System.out.println(character[R] + "(으)로 설정되었습니다.\n");
					break;
			case 9:
				System.out.println("이제 공부하세요!\n");
				scanner.close();
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
		}while(choice != 9);
		

	}

}
