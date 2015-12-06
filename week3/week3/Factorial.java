package week3;

public class Factorial {
	public <T extends Number> double fact(T num){
		double dNum = num.doubleValue();
		if (dNum == 1 || dNum ==2) {
			return 1;
		}
		long fact = (int)((fact(dNum-1) + fact(dNum-2)));
		
		return fact;
	}
}
