import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Points {
	private int x;
	private int y;
	private String path;

	public Points(int x, int y, String path) {
		this.x = x;
		this.y = y;
		this.path = path;
	}

	public int[] findNewPosition() {
		int newX = x;
		int newY = y;
		boolean reversed = false;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == '~') {
				reversed = !reversed;
			} else {
				if (path.charAt(i) == 'v' || path.charAt(i) == '^') {
					newY += newDirection(reversed, path.charAt(i));
				} else {
					newX += newDirection(reversed, path.charAt(i));
				}
			}
		}
		return new int[] { newX, newY };
	}

	private int newDirection(boolean reversed, char c) {
		switch (c) {
		case '>':
			return reversed ? -1 : 1;
		case '<':
			return reversed ? 1 : -1;
		case '^':
			return reversed ? 1 : -1;
		case 'v':
			return reversed ? -1 : 1;
		default:
			return 0;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(reader.readLine());
		int y = Integer.parseInt(reader.readLine());

		String path = reader.readLine();

		Points point = new Points(x, y, path);
		int[] newPos = point.findNewPosition();
		System.out.println("");
		System.out.printf("%d %d", newPos[0], newPos[1]);

	}
}
