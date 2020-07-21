package SDET.datastructures;

import java.util.*;

/**
 * 
 * @author vaibhavmhatre
 * 
 * map store key value pairs 
 * 
 * get and put are the primary method.
 * 
 * hash map and hash table 
 * 
 * hash map is asynchronous.One null key and multiple value can be null.
 * hash table is Synchronos.key and value cannot be null.
 * 
 * 
 * Q Given a string, print each character and number of its occurences.
 * example: for string "hello world", print:
 * 				h=1
 * 				l=3
 * 				etc..
 * 
 * Hint: when ever you need to store 'key-value' pairs, you should use 'Map' data structure.
 *
 */

public class MapDemo {

	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(s);
		//convert string to char array 
		char[] charArray =s.toCharArray();
		Map<Character, Integer > map = new HashMap<Character, Integer>();
		
		for (char c : charArray) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		
		for(Map.Entry entry: map.entrySet()) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
	}

}
