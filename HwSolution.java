import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HwSolution {

	public static void main(String[] args) {

		// create Map: nameMapA
		Map<String, String> nameMapA = new HashMap<>();

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
		Map<String, String> nameMapB = new HashMap<>();

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

	// isUnique tests if a map has unique values

	public static boolean isUnique(Map<String, String> map) {
		
		// create the set to call the value (they will be the unique)
		Set<String> values = new HashSet<String>();
		
		// iterate over the values in the map
		for (String value : map.values()) {
			// check if the set has the value we are currently examining
			if (values.contains(value)) {
				return false;// the value is already there

			} else {
				// add the value from the map to the set
				values.add(value);
			}
		}
		// no repeating values were found in the set
		return true;
	}
}
