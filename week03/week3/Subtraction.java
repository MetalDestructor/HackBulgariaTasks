package week3;

public class Subtraction {
	public <T1 extends Number, T2 extends Number> double subtract(T1 num1, T2 num2) {
		return num1.doubleValue() - num2.doubleValue();
	}
}
