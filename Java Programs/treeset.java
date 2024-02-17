package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class treeset{

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("12");
		l.add("22");
		l.add("22");
		l.add("45");
		l.add("56");
		TreeSet hs = new TreeSet(l);
		hs.add("89");
		System.out.println(hs);
		

	}

}
