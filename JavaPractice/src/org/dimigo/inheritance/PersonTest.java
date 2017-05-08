/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("Tom");
		
		Korean k = new Korean(" 한국사람 홍길동");
		System.out.println(k);
		
		Japanese j = new Japanese(" 일본사람 다나카");
		System.out.println(j);
		
		Chinese c = new Chinese(" 중국사람 왕밍");
		System.out.println(c);
		System.out.println();
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println();
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
	}
}
