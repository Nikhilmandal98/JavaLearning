package collectionpractice;

import java.util.HashSet;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetOfIntegers {

	private static final boolean Integer = false;

	public static void main(String[] args) {

		Set<Integer> MySecondSet = new HashSet<Integer>();

		MySecondSet.add(45);
		MySecondSet.add(50);
		MySecondSet.add(60);
		MySecondSet.add(70);
		MySecondSet.add(80);
		MySecondSet.add(90);
		MySecondSet.add(30);

		for (Integer item : MySecondSet) {
			System.out.println(item);

		}
	}
}
