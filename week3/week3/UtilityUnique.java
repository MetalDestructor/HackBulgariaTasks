package week3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;

public class UtilityUnique<T> {
	public T firstUnique(Collection<T> list){
		HashMap<Integer,Integer> brArr= new HashMap<>();
		Stack<T> values = new Stack<T>();
		int br = 0;
		brArr.put(0, br);
		for (T t : list) {
			for (T e : list) {
				if (t.equals(e)) {
					br++;
					
				}
			}
			if(brArr.get(0) > br){
				brArr.clear();
				brArr.put(0, br);
				values.push(t);
			}
		}
		return values.pop();
		
	}

}
