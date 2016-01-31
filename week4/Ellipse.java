package week4;

public class Ellipse implements Shape {
	private final LineSegment majorAxis;
	private final LineSegment minorAxis;
	private final double max;
	private final double min;

	public Ellipse(LineSegment majorAxis, LineSegment minorAxis) throws Exception {
		if (majorAxis == minorAxis) {
			System.out.println("Points are on the origin");
			throw new Exception();
		}
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
		max = this.majorAxis.getLength();
		min = this.minorAxis.getLength();
	}

	public Ellipse(Ellipse elipse) throws Exception {
		this(elipse.majorAxis, elipse.minorAxis);
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
		Double p = Math.PI * (3 * (min + max) - Math.sqrt((3 * min + max) * (3 * max + min)));
		return p;
	}

	@Override
	public Double getArea() {
		Double area = Math.PI * max * min;
		return area;
	}

	@Override
	public Point getCenter() {
		return new Point(0, 0);
	}
}
