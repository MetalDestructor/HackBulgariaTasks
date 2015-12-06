package week3;

public class Multiplication {
	public <T1 extends Number, T2 extends Number> double multiply(T1 num1, T1 num2) {
		return num1.doubleValue() * num2.doubleValue();
	}
}
