package SDET.datastructures;

import java.util.*;

/**
 * 
 * @author vaibhavmhatre
 *	Q. Given a String(say "hello world"), print the following
 *		a Index/position of the duplicate characters.
 *		b Total number of duplicate characters.
 *	example : for string "hello world"
 *		a Index/position of the duplicate characters: 3, 7, 9
 *		b Total number of duplicate characters: 3
 *
 *	Hint: whenever you see the term duplicate  or count in the question, most likely use 'Set' data structures
 *
 */
public class SetDemo {

	public static void main(String[] args) {
		
		String s = "hello world";
		
		// Convert string to character array method used is .toCharArray
		char[] charArray = s.toCharArray();
		
		//new hash set is created to save the charArray
		Set<Character> set = new HashSet<Character>();
		
		int count= 0;
		for(int i=0; i<charArray.length; i++) {
			//set works on boolean value and set dont take duplicate value
			//so the if statement does is add character array to set and as they dont take duplicate it keeps
			//it comes out of the loops and write the index till it add the whole charArray.datastructures
			if(!set.add(charArray[i])){
				System.out.println("Index/position of the duplicate characters : " +i);
				count++;
			}
		}
		System.out.println("Total number of duplicate characters: " +count);
	}

}
