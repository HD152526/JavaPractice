/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] question = {"가장 좋아하는 가수는?","가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answer = {"빅뱅", "원빈", "수학"};
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.println((i + 1) + "." + question[i]);		
			String Answer = scanner.nextLine();
			scanner.close();
			if(answer[i].equals(Answer)){
				System.out.println("정답입니다!");
			}
			else System.out.println("틀렸습니다!");
			
		}
		
		System.out.println("<< 결과출력 >>");
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < 3; i++){
			s.append(question[i]);
			s.append(answer[i]);
			s.append("입니다.");
		}
		System.out.println(s);
	}

}
