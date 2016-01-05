package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {

	public static void main(String[] args) throws IOException {
		// System.out.println(fibNumber(10));
		// System.out.println(nthLucas(5));
		// BufferedReader reader = new BufferedReader(new
		// InputStreamReader(System.in));
		// int n = Integer.parseInt(reader.readLine());
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// arr[i] = Integer.parseInt(reader.readLine());
		// }
		// System.out.println(IsIncreasing(arr));
		// System.out.println(IsDecreasing(arr));
		// System.out.println(maxEqualConsecutive(new int[] {1, 1, 2, 2, 3, 3,
		// 4, 4, 5, 5, 5}));
		// System.out.println(maxIncreasingConsecutive(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5 }));
		// System.out.println(uniqueWordsCount(new String[] {"HELLO!", "HELLO!", "HELLO!","HELLO!"}));

	}

	private static long fibonacciSequance(int n) {
		long fibNum;
		if (n == 1 || n == 2) {
			return 1;
		}

		fibNum = fibonacciSequance(n - 2) + fibonacciSequance(n - 1);
		return fibNum;
	}

	static long fibNumber(int n) {
		String fibString = "";
		for (int i = 1; i <= n; i++) {
			fibString += Long.toString(fibonacciSequance(i));
		}

		long fib = Long.parseLong(fibString);
		return fib;
	}

	static int nthLucas(int n) {
		if (n == 0) {
			return 2;
		}
		if (n == 1) {
			return 1;
		}
		int lucas = nthLucas(n - 2) + nthLucas(n - 1);
		return lucas;
	}

	static boolean IsIncreasing(int[] sequence) {
		int i = 1;
		while (sequence[i - 1] < sequence[i]) {
			if (i == sequence.length - 1) {
				return true;
			}
			i++;
		}
		return false;
	}

	static boolean IsDecreasing(int[] sequence) {
		int i = 1;
		while (sequence[i - 1] > sequence[i]) {
			if (i == sequence.length - 1) {
				return true;
			}
			i++;
		}
		return false;
	}

	static int maxEqualConsecutive(int[] items) {
		int maxCount = 0;
		int count = 1;
		for (int i = 1; i < items.length; i++) {
			if (items[i - 1] == items[i])
				++count;
			else if (maxCount < count) {
				maxCount = count;
				count = 1;
			}
		}
		return maxCount;
	}

	static int maxIncreasingConsecutive(int[] items) {
		int count = 0;
		int maxCount = 0;
		for (int i = 1; i < items.length; i++) {
			if (items[i - 1] <= items[i])
				++count;
			else if (maxCount < count) {
				maxCount = count;
				count = 0;
			}
		}
		return maxCount + 1;
	}

	static int uniqueWordsCount(String[] arr) {
		int br = 0;
		int minCount = 100;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] != arr[j]) br++;
			}
			if(br < minCount){
				minCount = br;
			}
			
		}
		return minCount + 1;
	}
	
}
