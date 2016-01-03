package week4;

public class Ellipse implements Shape {
	private LineSegment majorAxis;
	private LineSegment minorAxis;
	
	public Ellipse(LineSegment majorAxis, LineSegment minorAxis) {
		if (majorAxis == minorAxis) {
			System.out.println("Points are on the origin");
		}
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}

	public Ellipse(Ellipse elipse) {
		elipse.majorAxis = this.majorAxis;
		elipse.minorAxis = this.minorAxis;
	}

	public Point getTopBound() {
		Point pt = new Point(minorAxis.getEnd());
		return pt;
	}

	public Point getBottomBound() {
		Point pt = new Point(minorAxis.getStart());
		return pt;
	}

	public Point getLeftBound() {
		Point pt = new Point(majorAxis.getStart());
		return pt;
	}

	public Point getRightBound() {
		Point pt = new Point(majorAxis.getEnd());
		return pt;
	}

	@Override
	public Double getPerimeter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getCenter() {
		// TODO Auto-generated method stub
		return null;
	}
}
