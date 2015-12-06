package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class StartUp {

	public static void main(String[] args) throws IOException {
		Sumation sum = new Sumation();
		System.out.println(sum.sum(3, 4));
		Subtraction sub = new Subtraction();
		System.out.println(sub.subtract(15, 11));
		Multiplication mul = new Multiplication();
		System.out.println(mul.multiply(3, 7));
		Division div = new Division();
		System.out.println(div.devide(6, 3));
		Power power = new Power();
		System.out.println(power.pow(4, 7));
		Factorial fac = new Factorial();
		System.out.println(fac.fact(3));
		Stack st = new Stack(); // Error
		st.push(123); // no error
		System.out.println(st.isEmpty());
		st.pop();
		System.out.println(st.isEmpty());
		Palindrome<Integer> pal = new Palindrome<>(123321123);
		System.out.println(pal.isPalindrome());
		Palindrome<String> pal2 = new Palindrome<>("asddsa");
		System.out.println(pal2.isPalindrome());
		String[] arr = new String[6];

		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.toString(rnd.nextInt(10 + 1));
		}

		Array<String> arr1 = new Array<>(arr);
		System.out.println(arr1.minEl());

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		ExpressionOfBrackets asd = new ExpressionOfBrackets(line);
		System.out.println(ExpressionOfBrackets.makeE());

		LinkedList<Integer> li = new LinkedList<>();
		li.add(4);
		li.add(10);
		li.add(15);
		// Reverse.reverse(li);
		LinkedList<String> list = new LinkedList<>();
		list.add("ab");
		list.add("bc");
		list.add("cd");
		// Reverse.reverse(li);
		// Reverse.reverse(Reverse.reverse(li));

		Collection<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 1);
		UtilityUnique<Integer> util = new UtilityUnique<>();
		// System.out.println(UtilityUnique.firstUnique(ints));

		HashMap<String, Integer> one = new HashMap<>();
		one.put("nine", 9);
		one.put("twenty", 20);
		HashMapToString utilityMethodStringRead = new HashMapToString();
		System.out.println(utilityMethodStringRead.utility(one));
	}

}
