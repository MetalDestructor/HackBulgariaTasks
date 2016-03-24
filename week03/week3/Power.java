package week3;

public class Power {
	public <T1 extends Number, T2 extends Number> double pow(T1 num1, T2 num2) {
		return Math.pow(num1.doubleValue(), num2.doubleValue());
	}
}
