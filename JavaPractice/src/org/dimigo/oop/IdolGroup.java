/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *   |_ IdolGroup
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public class IdolGroup {

	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "트와이스"};
		
		String[][] memberName = {
				{"GD", "태양", "탑", "대성", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"지효", "모모", "쯔위", "나연", "사나", "미나", "정연", "다현", "채영"},
		};
		for(int i = 0; i < groupName.length; i++){	
			System.out.println("<<" + groupName[i] + ">>");
			for(int j = 0; j < memberName[i].length; j++){
				System.out.println(memberName[i][j]);
				
			}
			System.out.println();
		}
	}

}
