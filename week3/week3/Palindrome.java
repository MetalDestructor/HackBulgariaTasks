package week3;

public class Palindrome<T> {
	private T pNumber;
	
	public Palindrome(T num){
		this.pNumber = num;
	}

	public boolean isPalindrome() {
		String palindrome = pNumber.toString();
		if (palindrome.equals(new StringBuilder(palindrome).reverse().toString()))
			return true;
		return false;
	}
}
