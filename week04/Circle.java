package week4;

public class Circle implements Shape{
	private final Double radius;
	
	public Circle(Double radius){
		this.radius = radius;
	}
	
	public Circle(Circle circle){
		this(circle.radius);
	}
	
	public Point getLeftBound(){
		return new Point(-radius, 0);
	}
	public Point getRightBound(){
		return new Point(radius, 0); 
	}
	public Point getTopBound(){
		return new Point(0, radius);
	}
	public Point getBottomBound(){
		return new Point(0, -radius);
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
		return super.toString();
	}

	@Override
	public Double getPerimeter() {
		Double p = Math.PI*2*radius;
		return p;
	}

	@Override
	public Double getArea() {
		Double area = Math.PI*Math.pow(radius, 2);
		return area;
	}

	@Override
	public Point getCenter() {
		return new Point(0, 0);
	}
	

}
