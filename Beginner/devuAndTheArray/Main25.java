package devuAndTheArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main25 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = bf.readLine().split(" ");
		
		int q = Integer.parseInt(input[1]);
		
		int[] array = new int[Integer.parseInt(input[0])];
		input = bf.readLine().split(" ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(input[i]);
		}
		input = null;
		Arrays.sort(array);
		
		int number = 0;
		
		PrintWriter pw = new PrintWriter(System.out);
		while (q > 0) {
			number = Integer.parseInt(bf.readLine());
			if (array[0] <= number && array[array.length-1] >= number) {
				pw.println("Yes");
				//System.out.println("Yes");
			} else {
				pw.println("No");
				//System.out.println("No");
			}
			q--;
		}
		bf = null;
		pw.flush();
		pw.close();
	}
}
