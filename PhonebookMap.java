package homework;

import java.util.HashMap;
import java.util.Map;

public class PhonebookMap {

	public static void main(String[] args) {

		Map<Integer, String> myPhonebook = new HashMap<Integer, String>();
		myPhonebook.put(11111, "Agni");
		myPhonebook.put(1234, "Biju");
		myPhonebook.put(23451, "Raju");
		myPhonebook.put(11764, "john");
		myPhonebook.put(75411, "Nirjhor");
		myPhonebook.put(10098, "kutub");
		System.out.println(myPhonebook);
	}

}
