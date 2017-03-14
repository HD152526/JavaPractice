/**
 * 
 */
package org.dimigo.basic;

/**
 *<pre>
 * org.dimigo.basic
 *   |_ Operator
 * 
 * 1. 개요 : 디미베네 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int money = 1700000;
		int salary = 3;
		int store = 1500;
		System.out.println("<<디미베네 연간 인건비>>\n");
		System.out.println("월 평균 급여 : "+ String.format("%,d", money) + "원\n");
		System.out.println("점포 내 직원 수 : " + salary + "명\n");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개\n\n");
		System.out.println("연간 인건비 : " + String.format("%,d", (long)money*12*salary*store)+"원");
	}

}
