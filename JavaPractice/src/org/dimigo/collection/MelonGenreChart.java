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
		List<Music> balladlist = new ArrayList<Music>();
		List<Music> dancelist = new ArrayList<Music>();
	
		map.put("[발라드]", balladlist);
		map.put("[댄스]", dancelist);
		balladlist.add(new Music("팔레트", "아이유"));
		dancelist.add(new Music("I LUV IT", "PSY"));
		dancelist.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");//lkjb  nn
		printMap(map);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		dancelist.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		dancelist.remove(0);
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