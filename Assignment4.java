//ch11 exercise#13 write method isUnique that accepts a map whose keys and values are strings
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Assignment4 {

	public static void main(String[] args) {

		// create Map: nameMapA
		Map<String, String> nameMapA = new TreeMap<>();

		// map views (key set and values)
		nameMapA.put("Marty", "Stepp");
		nameMapA.put("Jessica", "Miller");
		nameMapA.put("Stuart", "Reges");
		nameMapA.put("Amanda", "Camp");
		nameMapA.put("Hal", "Perkins");

		// call isUnique method
		// print returned value (true/false)
		System.out.println("nameMapA : " + nameMapA);
		System.out.println("nameMapA is UNIQUE?  " + isUnique(nameMapA));

		// create Map: nameMapB
		Map<String, String> nameMapB = new TreeMap<>();

		// map views (key set and values)
		nameMapB.put("Kendrick", "Perkins");
		nameMapB.put("Stuart", "Reges");
		nameMapB.put("Jessica", "Miller");
		nameMapB.put("Bruce", "Reges");
		nameMapB.put("Hal", "Perkins");

		// call isUnique method
		// print returned value (true/false)
		System.out.println("nameMapB : " + nameMapB);
		System.out.println("nameMapB is UNIQUE?  " + isUnique(nameMapB));

	}

	// method for testing value uniqueness
	public static boolean isUnique(Map<String, String> map) {

		Set<String> set = new TreeSet<String>(map.values());

		if (map.values().size() != set.size()) {
			return false;
		}

		return true;
	}
}
