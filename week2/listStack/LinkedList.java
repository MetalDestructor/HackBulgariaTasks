package listStack;

import stack.*;
import doublylinkedlist.*;

public abstract class LinkedList extends DoublyLinkedList  implements IStack{

	@Override
	public void push() {
		
	}

	@Override
	public void pop() {
		
	}

	@Override
	public int length() {
		return 0;
	}

	@Override
	public void clear() {
		
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void add() {
		super.add();
	}

	@Override
	public void remove() {
		super.remove();
	}

	@Override
	public int size() {
		return super.size();
	}

	@Override
	public Object get(int ellementIndex) {
		return super.get(ellementIndex);
	}

	@Override
	public Object getHead() {
		return super.getHead();
	}

	@Override
	public Object getTail() {
		return super.getTail();
	}


	
}
