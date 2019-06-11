/*
* Write a method isSorted that returns true if the list is in sorted 
* (nondecreasing) order and returns false otherwise. An empty list is 
* considered to be sorted. 
*/

public class IsSorted {

	public static void main(String[] args) {
		LinkedIntList list1 = new LinkedIntList();
		list1.add(99);
		list1.add(55);
		list1.add(111);
		list1.add(81);
		list1.add(51);
		list1.add(1);
		System.out.println(list1);
		System.out.println("Is list1 sorted? " + list1.isSorted(list1));

		System.out.println();

		LinkedIntList list2 = new LinkedIntList();
		list2.add(1);
		list2.add(3);
		list2.add(5);
		list2.add(9);
		list2.add(13);
		list2.add(59);
		System.out.println(list2);
		System.out.println("Is list2 sorted? " + list2.isSorted(list2));

		System.out.println();

		LinkedIntList list3 = new LinkedIntList();
		list3.add(931);
		System.out.println(list3);
		System.out.println("Is list3 sorted? " + list3.isSorted(list3));

		System.out.println();

		LinkedIntList list4 = new LinkedIntList();
		System.out.println(list4);
		System.out.println("Is list4 sorted? " + list4.isSorted(list4));

	}

}
