package week4;

public class Circle implements Shape{
	private Double radius;
	
	public Circle(Double radius){
		this.radius = radius;
	}
	
	public Circle(Circle circle){
		circle.radius = this.radius;
	}
	
	public Point getLeftBound(){
		return null;
	}
	public Point getRightBound(){
		return null;
	}
	public Point getTopBound(){
		return null;
	}
	public Point getBottomBound(){
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
		return super.toString();
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
