package week3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;


public class Reverse {
	static <T> void  reverse (Collection<T> collection){
        Collection<T> reversed = new LinkedList<>();
        Iterator itr = collection.iterator();
        Object element;
        while(itr.hasNext()) {
            element = itr.next();
            reversed.add((T)element);
            System.out.print(element + " ");
        }
        collection.clear();
        Iterator itr2 = reversed.iterator();

        while(itr2.hasNext()) {
            element = itr.next();
            collection.add((T)element);
            System.out.print(element + " ");
        }
    }
}
