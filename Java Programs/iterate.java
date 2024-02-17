package Java;

import java.util.ArrayList;
import java.util.Iterator;

public class iterate {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("12");
		l.add("22");
		l.add("32");
		l.add("45");
		l.add("56");
		Iterator itr = l.iterator();  //forward traversing
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
