package FunnyArraySorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunnyArraySorter {

	private int pivot;

	public FunnyArraySorter(int pivot) {
		this.pivot = pivot;
	}

	FunnyArraySorter sorter = new FunnyArraySorter(12) {
		public void reverseSort(List<Integer> list) {
			Collections.sort(list, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
		}

		public void pivotSubstractionSort(List<Integer> list) {
			Collections.sort(list, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if (o1 < o2 - pivot)
						return o2;
					else if (o2 < o1 - pivot)
						return o1;
					else
						return o2;
				}
			});
		}

		public void pivotDivisionSort(List<Integer> list) {
			Collections.sort(list, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if (o1 / pivot > o2)
						return o1;
					else if (o2 / pivot > o1)
						return o2;
					else
						return o1;
				}
			});
		}
	};

}

