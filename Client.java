// Assignment 8
// 4th Edition of textbook Chapter 15 page 961 Exercise 3
// Write a method called    replaceAll    that accepts two 
// integer values as parameters and replaces all occurrences of 
// the first value in the list with the second value.  For 
// example, if a variable called    list    stores 
// [11, -7, 3, 42, 3, 0, 14, 3],    the call of    
// list.replaceAll(3,999);    should change the list to 
// store    [11, -7, 999, 42, 999, 0, 14, 999].

public class Client {

	public static void main(String[] args) {
		
		// construct the list
		int[] data = { 13,0,5,81,9,0,51,99,0 };
		
		//Create list of ArrayIntList
		ArrayIntList list = new ArrayIntList();
		
		//Adding the data to the list
		for (int n : data) {
			list.add(n);
		}
		
		// print the list before replacing
		System.out.println("list before replacing = " + list);

		//call the replaceAll method for replacing
		
		list.replaceAll(0, 1);
		
		//printing our list after replacing 

		System.out.println("replaced list: " + list);

		
	}

}
