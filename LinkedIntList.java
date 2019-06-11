// Simple first version of LinkedIntList with just a constructor and methods for add and toString.

public class LinkedIntList {
	ListNode front; // first value in the list
	int size;
	int count = 0;

	// post: constructs an empty list
	public LinkedIntList() {
		front = null;
	}

	// post: returns comma-separated, bracketed version of list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}
	}

	// post: appends the given value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
			size++;
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
				// size++;
			}
			current.next = new ListNode(value);
			size++;
		}
	}

	/// return the current # of elements in the list
	public int size1() {
		int count = 0;
		ListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;

	}

	public boolean isSorted(LinkedIntList list) {
		/*
		 * if ((front == null) || (list.size()==1)) { return true; } else { for(int i=0;
		 * i<list.size()-1; i++) { if (list.get(i) > list.get(i+1)) { return true; }
		 * else { return false; } } } return true; }
		 */
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				return false;
			}
			// else {
			// return false;
			// }
		}
		return true;
	}

	// return the value at a given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}

	public void remove(int index) {
		if (index == 0) {
			front = front.next;
			size--;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
			size--;
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	// pre: 0 < index <size()
	// return a refrence to the node at a given index
	public ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	// insert a value at a specified index
	public void add(int index, int value) {
		if (index == 0) {
			front = new ListNode(value, front);
			size++;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = new ListNode(value, current.next);
			size++;
		}
	}
}
