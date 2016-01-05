package week3;

public class Array<T extends String> {
	private T[] arr;

	public Array(T[] arr2) {
		this.arr = arr2;
	}

	public T minEl() {
		T minVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo(minVal) > 0)
				minVal = arr[i];
		}
		return minVal;
	}
}
