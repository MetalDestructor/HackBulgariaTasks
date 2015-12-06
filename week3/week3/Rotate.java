package week3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Rotate<T> {
	void rotate(Collection<T> collection, int rotateStep) {
		if (rotateStep < 0 || rotateStep > collection.size()) {
			System.out.println("cant make the operation");
			return;
		}
		int temp = rotateStep;
		Stack<T> stack = new Stack<>();
		Queue<T> queue = new LinkedList<>();

		Iterator<T> et = collection.iterator();
		while (et.hasNext()) {
			stack.push(et.next());
		}
		while (rotateStep > 0) {
			queue.add(stack.pop());
			rotateStep--;
		}
		Iterator<T> et2 = collection.iterator();
		for (int i = 0; i < collection.size() - temp; i++) {
			queue.add(et2.next());
		}
		collection.clear();
		collection.addAll(queue);
		Iterator<T> et3 = collection.iterator();
		while (et3.hasNext()) {
			System.out.println(et3.next());
		}

	}
}
