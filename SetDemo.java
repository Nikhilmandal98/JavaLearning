package collectionpractice;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> myFirstSet = new HashSet<String>();

		myFirstSet.add("Nepal");
		myFirstSet.add("kalam");
		myFirstSet.add("Nikhil");
		myFirstSet.add("kutub");
		myFirstSet.add("saphin");
		myFirstSet.add("Nirjhor");
		myFirstSet.add("pijus");
		myFirstSet.add("uttar");
		myFirstSet.add("Rajendra");
		for (String str : myFirstSet) {

			System.out.println(str);

		}

	}
}
