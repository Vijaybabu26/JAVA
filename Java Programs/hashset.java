package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class hashset{

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("12");
		l.add("22");
		l.add("22");
		l.add("45");
		l.add("56");
		HashSet hs = new HashSet(l);
		hs.add("89");
		System.out.println(hs);
		

	}

}
