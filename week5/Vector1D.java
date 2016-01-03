package week5;

import java.util.ArrayList;

public class Vector1D {
	ArrayList<Double> vectors;
	public Vector1D(int n) {
		vectors = new ArrayList<>();
	}
	
	public Vector1D(Vector1D vect){
		ArrayList<Double> vectorsCpy = vectors;
	}
	public Double getCoordinate(){
		for (Double e : vectors) {
			return e.doubleValue();
		}
		return null;
	}
	
}
