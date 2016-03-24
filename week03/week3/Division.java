package week3;

public class Division {
	public <T1 extends Number, T2 extends Number> double devide(T1 num1, T2 num2) {
		return num1.doubleValue() / num2.doubleValue();
	}
}
