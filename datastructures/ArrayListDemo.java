package datastructures;

import java.util.*;
/**
 * 
 * @author vaibhavmhatre
 * 
 * Q.what is ArrayList?
 * ArrayList is an implementation of java.util.list interface.
 * ArrayList is backend by an Array
 * 
 * Q.How ArrayList is different from Array?
 * ArrayList:
 * 		ArrayList size grows dynamically when we add more and more elements.
 * 		ArrayList provides various methods to work with the elements.
 * Array:
 * 		Array is fixed size but comparatively faster.
 * 		Array can be multi-dimensional like 2D and 3D arrays.
 * 
 * Q.Implement the method getUnAssignedCodes() in the following code.
 * 		Such that, unAssignedCodes = allCodes - assignedCodes
 * 
 * 	 for all the Array list API
 *    https://docs.oracle.com/javase/8/docs/api/
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		// 2 string array allcodes and assignedCodes 
		String[] allCodes= {"001","002","003","004","005","006","007","008","009"};
		
		System.out.print("Allcodes");
		System.out.println(Arrays.toString(allCodes));
		String[] assignedCodes= {"003","004"};
		System.out.print("AssignedCodes");
		System.out.println(Arrays.toString(assignedCodes));
		
		
		//Task is to implement the method getUnAssigned Codes
		String[] unassignedCodes = getUnAssignedCodes(allCodes,assignedCodes);
		
		
		//Arrays.toString helps to print the Array.
		System.out.print("Unassigned codes");
		System.out.println(Arrays.toString(unassignedCodes));
	}
		static String[] getUnAssignedCodes(String[] allCodes, String[] assignedCodes) 
		{
			//to convert array into arraylist
			List<String> list1 = new ArrayList<String>(Arrays.asList(allCodes));
			List<String> list2 = new ArrayList<String>(Arrays.asList(assignedCodes));
			
			// adding to the array list 
			list1.add("010");
			list2.add("010");
			
			
			System.out.println("printing list 1 :");
			//lambda expression to print arraylist using for each method 
			list1.forEach(value -> System.out.println(value));
			System.out.println("printing list 2 :");
			list2.forEach(value -> System.out.println(value));
			
			
			//this method will remove all the extra elements 
			
			list1.removeAll(list2); // .removeAll is a API called 
			//convert arraylist to array
		return list1.toArray(new String[list1.size()]);
	}

}
