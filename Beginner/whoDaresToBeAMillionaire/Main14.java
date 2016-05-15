package whoDaresToBeAMillionaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bf.readLine());

		int numOfQuestions = 0;
		int[] winPoints = null;
		while (test > 0) {
			int counter = 0;
			numOfQuestions = Integer.parseInt(bf.readLine());
			winPoints = new int[numOfQuestions + 1];
			String caInput = bf.readLine();
			String aInput = bf.readLine();
			String[] pInput = bf.readLine().split(" ");

			for (int i = 0; i < numOfQuestions + 1; i++) {
				winPoints[i] = Integer.parseInt(pInput[i]);
			}

			for (int i = 0; i < caInput.length(); i++) {
				if (caInput.charAt(i)==aInput.charAt(i)) {
					counter++;
				}
			}

			int max = 0;
			if (counter == numOfQuestions) {
				System.out.println(winPoints[numOfQuestions]);
			} else {
				for (int i = 0; i <= counter; i++) {
					if (winPoints[i] >= max) {
						max = winPoints[i];
					}
				}
				System.out.println(max);
			}

			test--;
		}
	}
}
