package matrix;

public class Matrix {
	private int r;
	private int b;
	private int g;
	
	public Matrix(int r, int b, int g){
		setR(r);
		setB(b);
		setG(g);
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	
	public void operate(MatrixOperation op){
		Pixel[][] arr = new Pixel[5][5];
		op.withPixel(14,15,arr);
	}
	@Override
	public String toString() {
		int res = getR() + getG() + getB();
		String result = Integer.toString(res);
		return result;
	}
}
