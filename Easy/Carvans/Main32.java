package carvans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main32 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(bf.readLine());
		int n;
		int[] cars;
		String[] input;
		int output = 1;

		while (t > 0) {
			n = Integer.parseInt(bf.readLine());
			cars = new int[n];

			input = bf.readLine().split(" ");
			for (int i = 0; i < cars.length; i++) {
				cars[i] = Integer.parseInt(input[i]);
			}
			input = null;

			if (n == 1) {
				pw.println("1");
				pw.flush();
				output = 1;
				t--;
				continue;
			}

			for (int i = 1; i < cars.length; i++) {
				if (cars[i] > cars[i-1]) {
					cars[i] = cars[i-1];
				} else {
					output++;
				}
			}
			
			pw.println(output);
			pw.flush();
			output = 1;
			
			t--;
		}
		pw.close();
	}
}
