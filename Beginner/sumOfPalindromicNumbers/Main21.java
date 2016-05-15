package sumOfPalindromicNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main21 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] input;
		int n = Integer.parseInt(bf.readLine());
		int first;
		int last;
		char[] array;
		while (n > 0) {
			input = bf.readLine().split(" ");
			first = Integer.parseInt(input[0]);
			last = Integer.parseInt(input[1]);
			input = null;
			boolean isPal;
			int sum = 0;
			while (first <= last) {
				if (first < 10) {
					sum += first;
					first++;
				} else {
					array = String.valueOf(first).toCharArray();
					isPal = checkIfPal(array);
					if (isPal) {
						sum += first;
					}
					first++;
				}
				array = null;
			}
			pw.println(sum);
			n--;
		}
		pw.flush();
		pw.close();
	}

	public static boolean checkIfPal(char[] array) {
		int length = array.length;
		int odd = 1;
		if (length % 2 == 0) {
			odd = 0;
		} else {
			odd = 1;
		}
		int i = 0;
		int j = length - 1;

		switch (odd) {
		case 0:
			while (j - i >= 1) {
				if (array[i] != array[j]) {
					return false;
				}
				if (j - i == 1) {
					return true;
				} else {
					i++;
					j--;
				}
			}
			break;
		case 1:
			while (j - i >= 0) {
				if (j - i == 0) {
					return true;
				}
				if (array[i] != array[j]) {
					return false;
				}
				i++;
				j--;
			}
			break;
		}
		return false;
	}
}