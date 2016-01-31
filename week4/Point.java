package week4;

public class Point {
	private static final Point start = new Point(0,0);
	private final Double x;
	private final Double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Point(){
		this.x = 0.0;
		this.y = 0.0;
	}
	public Point(Point p){
		this(p.getX(), p.getY());
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	
	@Override
	public String toString() {
		String res = "Point(" + this.x + ", " + this.y + ")";
		return res;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point){
			Point pt = (Point) obj;
			if(this.x == pt.x && this.y == pt.y){
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		int hash = 17;
        hash = hash * 23 + x.hashCode();
        hash = hash * 23 + y.hashCode();
        return hash;
	}
	public static LineSegment Add(Point point1, Point point2) throws Exception{
		return new LineSegment(point1,point2);
	}
	
	public static void main(String[] args){
		Point pt = new Point(5.4,7);
		Point pt2 = new Point(5,7);
		System.out.println(pt.toString());
		System.out.println(pt.equals(pt2));
	}
}
