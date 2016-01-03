package week4;	

public class Rectangle implements Shape{
	private Point topLeft;
	private Point botRight;

	public Rectangle(Point pt1, Point pt2) {
		if (pt1.getX() == pt2.getX()) {
			System.out.println("Points are on the same axis.");
		} else {
			topLeft = pt1;
			botRight = pt2;
		}
	}

	public Rectangle(Rectangle rect) {
		rect.topLeft = this.topLeft;
		rect.botRight = this.botRight;
	}

	public Point getUpperLeft() {
		return topLeft;
	}

	public Point getUpperRight() {
		Point upRight = new Point(botRight.getX(), topLeft.getY());
		return upRight;
	}

	public Point getLowerLeft() {
		Point botLeft = new Point(topLeft.getX(), botRight.getY());
		return botLeft;
	}

	public Point getLowerRight() {
		return botRight;
	}

	public LineSegment getLeftEdge() {
		LineSegment ls = new LineSegment(getUpperLeft(), getLowerLeft());
		return ls;
	}

	public LineSegment getRightEdge() {
		LineSegment ls = new LineSegment(getUpperRight(), getLowerRight());
		return ls;
	}

	public LineSegment getTopEdge() {
		LineSegment ls = new LineSegment(getUpperLeft(), getUpperRight());
		return ls;
	}

	public LineSegment getBottomEdge() {
		LineSegment ls = new LineSegment(getLowerLeft(), getLowerRight());
		return ls;
	}

	public Double getWidth() {
		Double width = new Double(Math.abs(Math.abs(getUpperLeft().getX()) - Math.abs(getUpperRight().getX())));
		return width;
	}

	public Double getHeight() {
		Double height = new Double(Math.abs(Math.abs(getUpperLeft().getY()) - Math.abs(getLowerLeft().getY())));
		return height;
	}

	public Point getCenter() {
		Point center = new Point((getUpperLeft().getX() + getUpperRight().getX()) / 2.0,
				(getUpperRight().getY() + getLowerRight().getY()) / 2.0);
		return center;
	}

	public Double getPerimeter() {
		Double perimeter = new Double(2 * getWidth() + 2 * getHeight());
		return perimeter;
	}

	public Double getArea() {
		Double area = new Double(getWidth() * getHeight());
		return area;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + topLeft.hashCode();
		hash = hash * 23 + botRight.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle rect = (Rectangle) obj;
			if (rect.getHeight() == this.getHeight() && rect.getWidth() == this.getWidth()) {
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		String res = String.format("Rectangle[(%.2f,%.2f), (%.2f,%.2f)]", topLeft.getX(), topLeft.getY(),
				getHeight(), getWidth());
		return res;
	}

	public static void main(String[] args) {
		Point pt1 = new Point(-1.0, 5.0);
		Point pt2 = new Point(4.0, 2.0);
		Rectangle rect = new Rectangle(pt1, pt2);
		System.out.println(rect.getCenter());
		System.out.println(rect.getPerimeter());
		System.out.println(rect.getArea());
		System.out.println(rect.toString());
		System.out.println(rect.hashCode());
		Rectangle rect2 = new Rectangle(new Point(0, 0), new Point(3, -3));
		System.out.println(rect2.toString());
		System.out.println(rect.equals(rect2));
	}
}
