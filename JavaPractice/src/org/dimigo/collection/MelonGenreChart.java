/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *<pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 *
 * @author 		: lee
 * @version 	: 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> list = new ArrayList<Music>();
		List<Music> list2 = new ArrayList<Music>();
		Music[] music = {
				new Music("I LUV IT", "PSY"),
				new Music("맞지?", "언니쓰"),
				new Music("SIGNAL", "트와이스"),
				new Music("팔레트", "아이유")
		};
		map.put("[발라드]", list);
		map.put("[댄스]", list2);
		list.add(music[3]);
		list2.add(music[0]);
		list2.add(music[1]);
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		list2.set(1, music[2]);
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		list2.remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);

	}

	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()) {
			int i = 1;
			System.out.println(key);
			for (Music value : map.get(key)) {
				System.out.println(i + value.toString());
				i += 1;
		}
	}
		System.out.println();
}
}