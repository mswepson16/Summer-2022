package framework;

import java.util.Iterator;
import java.util.Set;

public class Helpers {
	public static String getLastElement(Set<String>c) {
		final Iterator itr = c.iterator();
		Object lastElement = itr.next();
		while(itr.hasNext()) {
			lastElement = itr.next();
		}
		return (String) lastElement;
	}
}
