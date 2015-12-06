import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordGame {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = reader.readLine();
		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		char[][] map = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = reader.readLine().charAt(0);
			}
		}

		System.out.println(countTheWords(map, word));
	}

	private static int countTheWords(char[][] charMap, String word) {
		int rows = charMap.length;
		int cols = charMap[0].length;
		int counter = 0;

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				for (int xIncrease = -1; xIncrease <= 1; xIncrease++) {
					for (int yIncrease = -1; yIncrease <= 1; yIncrease++) {
						if (xIncrease == 0 && yIncrease == 0) {
							continue;
						}
						int currentRow = row;
						int currentCol = col;
						int index = 0;

						while (index <= word.length()) {
							if (currentRow < 0 || currentRow >= rows || currentCol < 0 || currentCol >= cols) {
								break;
							}

							if (index >= word.length() || charMap[currentRow][currentCol] != word.charAt(index)) {
								break;
							}

							currentRow += xIncrease;
							currentCol += yIncrease;
							index++;

							if (index == word.length()) {
								counter++;
							}
						}
					}
				}
			}
		}
		return (isPalindrome(word)) ? counter / 2 : counter;
	}

	private static boolean isPalindrome(String word) {
		int wordLength = word.length();
		for (int i = 0; i < wordLength; i++) {
			if (word.charAt(i) != word.charAt(wordLength - (i + 1))) {
				return false;
			}
		}
		return true;
	}

}
