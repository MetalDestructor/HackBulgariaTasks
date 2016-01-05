package week3;

import java.util.Collection;

interface IStack<T> {

	void push(T element);

	void pop(T ellement);

	int length();

	void clear();

	boolean isEmpty();
}

public abstract class Stack implements Collection, IStack {
	private Stack els; 
	
	public Stack(){
		
	}
	@Override
	public void push(Object element) {
		els.push(element);
	}

	@Override
	public void pop(Object element) {
		els.pop(element);
	}

	@Override
	public int length() {
		els.length();
		return 0;
	}

	@Override
	public void clear() {
		els.clear();
	}

	@Override
	public boolean isEmpty() {
		if (els.isEmpty() == true) {
			return true;
		}
		return false;
	}

}
