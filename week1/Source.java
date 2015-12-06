package week1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Source {

	public static void main(String[] args) {
		Random rnd = new Random();
		// System.out.println(isOdd(5));
		// System.out.println(isPrime(5));

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(10) + 1;
		}

		// System.out.println(min(arr));
		// System.out.println(kthMin(4, arr));
		// System.out.println(getAverage(arr));
		// System.out.println(doubleFac(3));
		// System.out.println(kthFac(2, 3));
		// System.out.println(getSmallestMultiple(5));
		// System.out.println(getLargestPalindrome(2616141));
		short[][] image = new short[5][5];
		for (int i = 0; i < image[0].length; i++) {
			for (int j = 0; j < image.length; j++) {
				image[i][j] = (short) (rnd.nextInt(255) + 1);
			}
		}
		// System.out.println(histogram(image));
		// System.out.println(pow(2, 5));
		// System.out.println(getOddOccurrence(arr));
		int n = 5;
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = rnd.nextInt(10) + 1;
			b[i] = rnd.nextInt(10) + 1;
		}
		// System.out.println(maximalScalarSum(a, b));
		// System.out.println(maxSpan(a));
		// System.out.println(canBalance(a));
		// TODO
		// System.out.println(reverseMe("Test"));
		// System.out.println(reverseEveryChar("Ima love Magi"));
		// System.out.println(isPalindrome("hpdsdph"));
		// System.out.println(isPalindrome(1234321));
		// System.out.println(copyEveryChar("tldr", 3));
		// System.out.println(getPalindromeLength("asd*dsa"));
		// System.out.println(countOcurrences("da", "dadaaaaadada"));
		// System.out.println(decodeUrl("kitten%20pic.jpg"));
		// System.out.println(sumOfNumbers("12 99 1"));
		// System.out.println(anagram("Ello","llEo"));
		// System.out.println(hasAnagramOf("asd","wuegranafdasdandfha"));
		// TODO
		// System.out.println(isHack(8191));
		// System.out.println(nextHack(8031));
		// System.out.println(countVowels("A nice day to code!"));
		// System.out.println(countConsonants("Theistareykjarbunga"));
		// System.out.println(pScore(198));
		// TODO
		// TODO
		// System.out.println(friday_years("1753", "2000"));
		// System.out.println(isCreditCardValid("79927398715"));
		// System.out.println(is_an_bn("aaaaabbbbb"));
		// TODO
		// System.out.println(zero_insert(555));

	}

	static boolean isOdd(int n) {
		boolean result = (n % 2 == 1) ? true : false; // (n & 1) ? true : false;

		return result;
	}

	static boolean isPrime(int n) {
		if (n == 1 || n == 0)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static int min(int[] arr) {
		int minVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minVal)
				minVal = arr[i];
		}
		return minVal;
	}

	static int kthMin(int k, int[] array) {
		Arrays.sort(array);
		return array[k];
	}

	static int getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	static long doubleFac(int n) {
		long fact = 1L;
		long dFact = 1L;
		for (long i = 1; i <= n; i++) {
			fact *= i;
		}
		for (int j = 1; j <= fact; j++) {
			dFact *= j;
		}
		return dFact;
	}

	static long kthFac(int k, int n) {
		long product = 1;
		for (int i = 0; i < k; i++) {
			for (int j = n; j > 0; j--) {
				product *= j;
			}
			n = (int) product;
			if (i + 1 != k) {
				product = 1;
			}
		}
		return product;
	}

	static long getSmallestMultiple(int upperBound) {
		int br = 0;
		for (long i = 1; true; i++) {
			for (int j = 1; j <= upperBound; j++) {
				if (i % j == 0)
					br++;
				if (br == upperBound)
					return i;
			}
			br = 0;
		}
	}

	static long getLargestPalindrome(long N) {
		String strI;
		for (long i = N; i > 0; i--) {
			strI = Long.toString(i);
			if (strI.equals(new StringBuilder(strI).reverse().toString()))
				return i;
		}
		return 0;
	}

	static int[] histogram(short[][] image) {
		int index = 0;
		int[] result = new int[100];
		for (int i = 0; i < image[0].length; i++) {
			for (int j = 0; j < image.length; j++) {
				if (i == image[i][j]) {
					result[index] = i;
					index++;
				}
			}
		}
		return result;
	}

	static long pow(int a, int b) {
		if (b == 0)
			return 1;
		long x = pow(a, b / 2);

		if (b % 2 == 0)
			return (x * x);
		else
			return (a * x * x);
	}

	static int getOddOccurrence(int[] array) {
		int br = 0;
		int takenEll = array[0];
		for (int i = 0; i < array.length; i++) {
			takenEll = array[i];
			for (int j = 0; j < array.length; j++) {
				if (takenEll == array[j]) {
					br++;
				}
				if (br % 2 != 0) {
					return takenEll;
				}
			}
			br = 0;
		}
		return 0;
	}

	static long maximalScalarSum(int[] a, int[] b) {
		long scalarSum = 0;
		long maxScalarSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				scalarSum += a[i] * b[j];
			}
			if (maxScalarSum < scalarSum) {
				maxScalarSum = scalarSum;
			}
			scalarSum = 0;
		}
		return maxScalarSum;
	}

	static int maxSpan(int[] numbers) {
		int span = 0;
		int maxSpan = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j >= 0; j--) {
				if (numbers[i] == numbers[j]) {
					span = j - i;
					if (maxSpan < span) {
						maxSpan = span;
					}
					break;
				}
			}
		}
		return maxSpan;
	}

	static boolean canBalance(int[] numbers) {
		int sum1 = 0;
		int sum2 = 0;
		int bound = (numbers.length % 2 == 0) ? (numbers.length / 2) : numbers.length / 2 + 1;
		for (int i = 0; i < bound; i++) {
			sum1 += numbers[i];
		}
		for (int i = numbers.length - 1; i > bound - 1; i--) {
			sum2 += numbers[i];
		}
		return (sum1 == sum2) ? true : false;
	}

	int[][] rescale(int[][] original, int newWidth, int newHeight) { // nope
		int[][] arr = new int[5][5];
		return arr;
	}

	static String reverseMe(String argument) {
		String newString = "";
		for (int i = argument.length() - 1; i >= 0; i--) {
			newString += argument.charAt(i);
		}
		return newString;
	}

	static String reverseEveryChar(String arg) {
		String rev = "";
		int hold = 0;
		for (int i = 0; i < arg.length(); i++) {
			if (arg.charAt(i) == ' ' || i == arg.length() - 1) {
				for (int j = i; j >= hold; j--) {
					rev += arg.charAt(j);
				}
				hold = i;
			}
		}
		return rev;
	}

	static boolean isPalindrome(String argument) {
		if (argument.equals(new StringBuilder(argument).reverse().toString()))
			return true;
		else
			return false;
	}

	static boolean isPalindrome(int argument) {
		String sArg = Integer.toString(argument);
		return isPalindrome(sArg);
	}

	static String copyEveryChar(String input, int k) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < k; j++) {
				str += input.charAt(i);
			}
		}
		return str;
	}

	static int getPalindromeLength(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '*' || i == input.length() - 1) {
				count++;
			}
		}
		return count;
	}

	static int countOcurrences(String needle, String haystack) {
		String current = "";
		int br = 0;
		for (int i = 0; i < haystack.length() - (needle.length() - 1); i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < needle.length(); j++) {
				sb.append(haystack.charAt(i + j));
			}
			current = sb.toString();
			if (current.equals(needle)) {
				br++;
			}
			current = "";
		}
		return br;
	}

	static String decodeUrl(String input) {
		String url = java.net.URLDecoder.decode(input);
		return url;
	}

	static int sumOfNumbers(String input) {
		input = input.replaceAll("[\\D]+", " ");

		String[] numbers = input.split(" ");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
		}
		return sum;
	}

	static boolean anagram(String A, String B) {

		if (A.length() != B.length()) {
			return false;
		}
		char[] a = new char[A.length()];
		char[] b = new char[B.length()];
		for (int i = 0; i < A.length(); i++) {
			a[i] = A.charAt(i);
			b[i] = B.charAt(i);
		}

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	static boolean hasAnagramOf(String A, String B) {
		if (countOcurrences(A, B) > 0) {
			return true;
		}
		return false;
	}

	static int[][] convertToGreyscale(String imgPath) { // nope
		int[][] greyscale = new int[6][6];
		return greyscale;
	}

	static boolean isHack(int n) {
		int counter = 0;
		String binary = Integer.toBinaryString(n); // 8031 -> 1111101011111(hack
													// number)
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				counter++;
			}
		}
		if (counter % 2 == 1) {
			if (isPalindrome(binary))
				return true;
		}
		return false;
	}

	static int nextHack(int n) {
		for (int i = n; true; i++) {
			if (isHack(i)) {
				return i;
			}
		}
	}

	static int countVowels(String str) {
		int counter = 0;
		String hold = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (hold.charAt(i) == 'a' || hold.charAt(i) == 'e' || hold.charAt(i) == 'i' || hold.charAt(i) == 'o'
					|| hold.charAt(i) == 'u' || hold.charAt(i) == 'y')
				counter++;
		}
		return counter;
	}

	static int countConsonants(String str) {
		int br = 0;
		String hold = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (hold.charAt(i) > 65 && hold.charAt(i) < 69)
				br++;
			if (hold.charAt(i) > 69 && hold.charAt(i) < 73)
				br++;
			if (hold.charAt(i) > 73 && hold.charAt(i) < 79)
				br++;
			if (hold.charAt(i) > 79 && hold.charAt(i) < 85)
				br++;
			if (hold.charAt(i) > 85 && hold.charAt(i) < 89)
				br++;
			if (hold.charAt(i) == 'z')
				br++;
		}
		return br;
	}

	static int pScore(int n) {
		if (isPalindrome(n)) {
			return 1;
		}
		String stringN = Integer.toString(n);
		int reversedN = Integer.parseInt(reverseMe(stringN));
		int p = 1 + pScore(n + reversedN);
		return p;
	}

	static String numbersToMessage(int[] pressedSequence) { // nope
		return "";
	}

	static int[] messageToNumbers(String message) { // nope
		int[] nums = new int[2];
		return nums;
	}

	private static boolean isFridayYear(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year); // Set only year

		return calendar.get(Calendar.WEEK_OF_YEAR) > 49;
	}

	static int friday_years(String start, String end) {
		int count = 0;
		int startYear = Integer.parseInt(start);
		int endYear = Integer.parseInt(end);

		for (int i = startYear; i <= endYear; i++) {
			if (isFridayYear(i))
				count++;
		}

		return count;
	}

	static boolean isCreditCardValid(String number) {
		if (number.length() % 2 == 0) {
			return false;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < number.length(); i++) {
			int current = Character.getNumericValue(number.charAt(i));
			if (current % 2 == 0)
				sb.append(current * 2);
			else
				sb.append(current);
		}
		String cardNum = sb.toString();
		int sum = 0;
		for (int i = 0; i < cardNum.length(); i++) {
			sum += Character.getNumericValue(cardNum.charAt(i));
		}
		if (sum % 10 == 0)
			return true;
		else
			return false;
	}

	static boolean is_an_bn(String word) {
		if (word.equals(""))
			return false;
		int br1 = 0;
		int i = 0;
		char current = word.charAt(0);
		while (word.charAt(i) == current) {
			++br1;
			++i;
		}
		current = word.charAt(i);
		int br2 = 0;
		while (word.charAt(i) == current && i < word.length()) {
			++br2;
			if (i == word.length() - 1) {
				break;
			}
			++i;
		}
		if (br1 != br2)
			return false;
		else
			return true;
	}

	static String reduce_file_path(String path) {
		// not finished
		StringBuilder sb = new StringBuilder();
		int hold = 0;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == '/') {
				if (i == 0) {
					sb.append(path.charAt(i));
				} else {
					for (int j = hold; j < i; j++) {

					}
				}

			}
		}
		return path;
	}

	static int zero_insert(int n) { // buggy
		String num = Integer.toString(n);
		int fNum;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < num.length(); i++) {
			int hold1 = Character.getNumericValue(num.charAt(i - 1));
			int hold2 = Character.getNumericValue(num.charAt(i));
			if (num.charAt(i - 1) == num.charAt(i)) {
				sb.append(num.charAt(i - 1));
				sb.append('0');
				sb.append(num.charAt(i));
			} else if ((hold1 + hold2) % 10 == 0) {
				sb.append(num.charAt(i - 1));
				sb.append('0');
				sb.append(num.charAt(i));
			} else {
				sb.append(num.charAt(i));
			}
		}
		String fString = sb.toString();
		fNum = Integer.parseInt(fString);
		return fNum;
	}
}
