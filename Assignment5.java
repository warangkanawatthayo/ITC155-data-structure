// assignment 5
// write a method called writeNums that takes an integer n as a parameter and print
// to the console the first n integers starting with 1 in sequential order, separated
// by commas. for example, consider the following calls:
// writeNums (5);
// System.out.println(); // to complete the line of output
// writeNums (12);
// System.out.println(); // to complete the line of output
// these calls should produce the following output
// 1, 2, 3, 4, 5
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12

public class Assignment5 {

	public static void main(String[] args) {

		writeNums(9);
		System.out.println();
		
		writeNums(5);
		System.out.println();

		writeNums(12);
		System.out.println();
	}

	public static void writeNums(int n) {

		if (n < 1) {

			throw new IllegalArgumentException();

		} else if (n == 1) {

			System.out.print(1);

		} else {

			writeNums(n - 1);
			System.out.print(", " + n);

		}
	}
}
