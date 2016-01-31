package week4;

public class Triangle implements Shape{
	private final Point A;
	private final Point B;
	private final Point C;

	public Triangle(Point pt1, Point pt2, Point pt3) throws Exception {
		if (this.A.getX() == this.B.getX() && this.B.getX() == this.C.getX()) {
			System.out.println("Points are on the same axis.");
			this.A = null;
			this.B = null;
			this.C = null;
			throw new Exception();
		} else {
			A = pt1;
			B = pt2;
			C = pt3;
		}
	}

	public Triangle(Triangle tri) throws Exception {
		this(tri.A, tri.B, tri.C);
	}

	public Point getUpperLeft() {
		return A;
	}

	public Point getLowerLeft() {
		return B;
	}

	public Point getLowerRight() {
		return C;
	}

	public LineSegment getLeftEdge() throws Exception {
		LineSegment ls = new LineSegment(getUpperLeft(), getLowerLeft());
		return ls;
	}

	public LineSegment getRightEdge() throws Exception {
		LineSegment ls = new LineSegment(getUpperLeft(), getLowerRight());
		return ls;
	}

	public LineSegment getBottomEdge() throws Exception {
		LineSegment ls = new LineSegment(getLowerLeft(), getLowerRight());
		return ls;
	}

	public LineSegment displayBase() throws Exception {
		if (getLeftEdge().compareTo(getRightEdge()) == 1) {
			if (getLeftEdge().compareTo(getBottomEdge()) == 1) {
				return getLeftEdge();
			} else {
				return getBottomEdge();
			}
		} else {
			if (getRightEdge().compareTo(getBottomEdge()) == 1) {
				return getRightEdge();
			} else {
				return getBottomEdge();
			}

		}
	}

	@Override
	public Double getPerimeter() {
		return null;
	}

	@Override
	public Double getArea() {
		return null;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		String res = String.format("Triangle[(%f,%f), (height,base)]", getUpperLeft().getX(), getUpperLeft().getY());
		return res;
	}

	@Override
	public Point getCenter() {
		return null;
	}
	
	

	// public LineSegment displayHeight(){
	// //LineSegment height = new LineSegment(getUpperLeft(),)
	// }
	
	
}
