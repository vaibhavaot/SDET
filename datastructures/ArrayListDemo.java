package datastructures;
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
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		String[] allCodes= {"001","002","003","004","005","006","007","008","009"};
		String[] assignedCodes= {"003","004"};
		
		String[] unassignedCodes = getUnAssignedCodes(allCodes,assignedCodes);
		

	}

		static String[] getUnAssignedCodes(String[] allCodes, String[] assignedCodes) {
		return null;
	}

}
