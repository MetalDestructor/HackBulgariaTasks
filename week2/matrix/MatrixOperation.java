package matrix;

public interface MatrixOperation<Pixel> {
	Pixel withPixel(int x, int y, Pixel[][] matrix);
}
