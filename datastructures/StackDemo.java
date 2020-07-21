package SDET.datastructures;

import java.util.*;

/**
 * 
 * @author vaibhavmhatre
 *
 * Q. Given a string that contains only brackets, write a method named isBalanced(String s)
 * 	   which returns true if the brackets in the given String are balanced, otherwise return false.
 * 
 * example:
 * a. "{ [ ( ) ] }" - isBalanced(String s) should return true
 * b. "{} [] ()" 	- isBalanced(String s) should return true
 * c. "{ [ ( ] ) }" - isBalanced(String s) should return false
 * d. "{} [] ("		- isBalanced(String s) should return false
 * 
 * HINT: When you come acreoos a closing brackets, check if it matches with the last opening bracket thats still open
 */
public class StackDemo {

	public static void main(String[] args) {
		String s1 ="{[()]}";//balanced
		String s2 ="{}[]()";//balanced
		String s3 ="{[(])}";//not balanced
		String s4 ="{}[](";//not balanced
		System.out.println("s1 is balanced:" + isBalanced(s1));
		System.out.println("s2 is balanced:" + isBalanced(s2));
		System.out.println("s3 is balanced:" + isBalanced(s3));
		System.out.println("s4 is balanced:" + isBalanced(s4));

	}

	 static boolean isBalanced(String s) {
		 Stack<Character> stack = new Stack();
		for(char c: s.toCharArray()) {
			if(c =='{' || c == '[' || c == '(' ) {
				stack.push(c);
			}
			else if(c == '}') {
				if(!(stack.pop() == '{')) {
					return false;
				}
				
			}else if(c == ']') {
				if(!(stack.pop() == '[')) {
					return false;
				}
				
			}else if(c == ')') {
				if(!(stack.pop() == '(')) {
					return false;
				}
				
			}
		}
		
		if(!(stack.empty())) {
			return false;
		}
		return true;
	}

}
