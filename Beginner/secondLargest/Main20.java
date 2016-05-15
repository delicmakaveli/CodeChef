package secondLargest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main20 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int n = Integer.parseInt(bf.readLine());
		String[] input;
		int[] array;
		while(n > 0) {
			input = bf.readLine().split(" ");
			array = new int[input.length];
			for (int i = 0; i < input.length; i++) {
				array[i] = Integer.parseInt(input[i]);
			}
			input = null;
			int max = array[0];
			int max1 = -2147483648;
			int temp = array[0];
			
			for (int i = 1; i < array.length; i++) {
				if (array[i] > max) {
					temp = max;
					max = array[i];
					max1 = temp;
				} else if (array[i] < max) {
					if (array[i] > max1) {
						max1 = array[i];
					}
				}
			}
			array = null;
			pw.println(max1);
			n--;
		}
		pw.flush();
		pw.close();
	}
}
