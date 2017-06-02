/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *<pre>
 * org.dimigo.collection
 *   |_ MelonChart
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		Music[] music = {
				new Music("I LUV IT", "PSY"),
				new Music("맞지?", "언니쓰"),
				new Music("SIGNAL", "트와이스"),
				new Music("팔레트", "아이유")
		};
	
		list.add(music[0]);
		list.add(music[1]);
		System.out.println("-- << 멜론 챠트 >> --");
		printList(list);
		
		list.add(1, music[2]);
		System.out.println("-- <<2위 곡 추가>> --");
		printList(list);
		
		list.set(2, music[3]);
		System.out.println("-- <<3위 곡 변경>> --");
		printList(list);
		
		list.remove(1);
		System.out.println("-- <<2위 곡 삭제>> --");
		printList(list);
		
		list.clear();
		System.out.println("-- <<전체 리스트 삭제>> --");
		printList(list);
	}
	
	public static void printList(List<Music> list){
		int i = 1;
		for(Music m : list){
			System.out.println(i + m.toString());
			i++;
		}
		System.out.println();
		i = 0;
	}
}
