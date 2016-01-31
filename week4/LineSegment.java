package week4;

public class LineSegment implements Comparable {
	private final Point start;
	private final Point end;

	public LineSegment(Point start, Point end) throws Exception {
		if (start.equals(end)) {
			System.out.println("Cannot create a line segment with zero length");
			this.start = null;
			this.end = null;
			throw new Exception();
		} else {
			this.start = start;
			this.end = end;
		}
	}

	public LineSegment(LineSegment ls) throws Exception {
		this(ls.getStart(), ls.getEnd());
	}
	
	public Point getStart(){
		return this.start;
	}
	
	public Point getEnd(){
		return this.end;
	}

	public double getLength() {
		double res = Math.sqrt(Math.pow(start.getY() - end.getY(), 2) + Math.pow(start.getX() - end.getX(), 2));
		return res;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + start.hashCode();
		hash = hash * 23 + end.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LineSegment) {
			LineSegment ls = (LineSegment) obj;
			if (start.equals(ls.start) && end.equals(ls.end)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String res = String.format("Line[(%f, %f)(%f, %f)]", start.getX(), start.getY(), end.getX(), end.getY());
		return res;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof LineSegment) {
			LineSegment line = (LineSegment) o;
			if (this.getLength() < line.getLength()) {
				return -1;
			} else if (this.getLength() > line.getLength()) {
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}
	public static void main(String[] args) throws Exception {
		LineSegment ls = new LineSegment(new Point(3, 5), new Point(9, 8));
		LineSegment ls2 = new LineSegment(new Point(3, 5), new Point(9, 8));
		System.out.println(ls.getLength());
		System.out.println(ls.toString());
		System.out.println(ls.equals(ls2));
		System.out.println(ls.compareTo(ls2));
		System.out.println(ls.hashCode());
	}

}
