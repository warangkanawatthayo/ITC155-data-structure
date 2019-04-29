//assignment#3
//write method countUnique that accepts a list of integers as a parameter and returns

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(9);
		list.add(13);
		list.add(31);
		list.add(31);
		list.add(5);
		list.add(11);
		list.add(99);
		list.add(8);

		System.out.println("The number of unique integers is " + countUnique(list) + ".");
	}

	public static int countUnique(List<Integer> list) {
		HashSet<Integer> numbers = new HashSet<Integer>(list);
		return numbers.size();
	}

}
