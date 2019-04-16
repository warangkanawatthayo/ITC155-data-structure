import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {
		
		//fill the list
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Bangkok");
		cityNames.add("Lisbon");
		cityNames.add("Paris");
		cityNames.add("London");
		cityNames.add("Nice");
		cityNames.add("Phuket");
		cityNames.add("Seville");
		cityNames.add("Montecarlo");
		cityNames.add("Porto");

		System.out.println(cityNames);

		System.out.print(removeEvenLength(cityNames));
	}
	
	//to remove all of the strings of even length from the list
	public static ArrayList<String> removeEvenLength(ArrayList<String> cityList) {
		for (int i = 0; i < cityList.size(); i++) {
			int word = (cityList.get(i)).length();
			if (word % 2 == 0) {
				cityList.remove(i);
			}
		}
		return cityList;

	}

}
