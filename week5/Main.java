package week5;

public class Main {

	public static void main(String[] args) {
		double[] dimentions1 = new double[5];
		dimentions1[0] = 3.5;
		dimentions1[1] = 1.5;
		dimentions1[2] = 1.7;
		dimentions1[3] = 9.1;
		dimentions1[4] = 4.3;
		double[] dimentions2 = new double[5];
		dimentions2[0] = 4.6;
		dimentions2[1] = 2.4;
		dimentions2[2] = 9.6;
		dimentions2[3] = 1.2;
		dimentions2[4] = 6.2;
		Vector vector1 = new Vector(dimentions1);
		Vector vector2 = new Vector(dimentions2);
		
		vector1.getCoordinates(3);
		
	}

}