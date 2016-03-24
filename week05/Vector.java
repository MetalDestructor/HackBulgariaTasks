package week5;

public class Vector {
	private final double[] mCoordinates;

	public Vector(double... coordinates) {
		mCoordinates = new double[coordinates.length];
		for (int i = 0; i < coordinates.length; i++) {
			mCoordinates[i] = coordinates[i];
		}
	}

	public Vector(Vector vector) {
		this(vector.mCoordinates);
	}

	public double getCoordinate(int i) {
		return mCoordinates[i];
	}

	public void setCoordinate(int i, double value) {
		mCoordinates[i] = value;
	}

	public int getDimentions() {
		return mCoordinates.length;
	}

	public double getLength() {
		double length = 0;
		for (double coord : mCoordinates) {
			length += Math.pow(coord, 2);
		}
		return Math.sqrt(length);
	}

	@Override
	public int hashCode() {
		int root = (int) mCoordinates[0];
		for (int i = 0; i < mCoordinates.length; i++) {
			root += (int) mCoordinates[i] * 42;
		}
		return root;
	}

	@Override
	public boolean equals(Object vector) {
		if (vector instanceof Vector) {
			Vector newVector = (Vector) vector;
			if (newVector.getDimentions() != this.getDimentions()) {
				return false;
			} else {
				for (int i = 0; i < mCoordinates.length; i++) {
					if (this.mCoordinates[i] != newVector.mCoordinates[i]) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder theString = new StringBuilder();
		theString.append("Coordinates:");
		for (int i = 0; i < mCoordinates.length; i++) {
			if (i < mCoordinates.length) {
				theString.append(String.format("%d, ", mCoordinates[i]));
			} else {
				theString.append(String.format("%d.", mCoordinates[i]));
			}
		}
		String result = theString.toString();
		return result;
	}

	public void add(Vector vector) {
		if (vector.getDimentions() != this.getDimentions()) {
			System.out.println("Vectors cannot be added");
			return;
		} else {
			for (int i = 0; i < mCoordinates.length; i++) {
				this.mCoordinates[i] += vector.mCoordinates[i];
			}
		}
	}

	public void substract(Vector vector) {
		if (vector.getDimentions() != this.getDimentions()) {
			System.out.println("Vectors cannot be added");
			return;
		} else {
			for (int i = 0; i < mCoordinates.length; i++) {
				this.mCoordinates[i] -= vector.mCoordinates[i];
			}
		}
	}

	public void add(double n) {
		for (int i = 0; i < mCoordinates.length; i++) {
			mCoordinates[i] += n;
		}
	}

	public void subtract(double n) {
		for (int i = 0; i < mCoordinates.length; i++) {
			mCoordinates[i] -= n;
		}
	}

	public void multiply(double n) {
		for (int i = 0; i < mCoordinates.length; i++) {
			mCoordinates[i] *= n;
		}
	}

	public void divide(double n) {
		for (int i = 0; i < mCoordinates.length; i++) {
			mCoordinates[i] /= n;
		}
	}

	public static double dotProduct(Vector vector1, Vector vector2) {
		double dotProduct = 0;
		if (vector1.getDimentions() != vector2.getDimentions()) {
			System.out.println("Vectors cannot be added");
			return dotProduct;
		}
		for (int i = 0; i < vector1.getDimentions(); i++) {
			dotProduct += vector1.mCoordinates[i] * vector2.mCoordinates[i];
		}
		return dotProduct;
	}

}
