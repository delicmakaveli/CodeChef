package elephantAndPermutations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main28 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		int size = 0;
		String[] input = null;
		int[] numbers = null;
		int local = 0;
		int global = 0;
		PrintWriter pw = new PrintWriter(System.out);
		while (t > 0) {
			size = Integer.parseInt(bf.readLine());
			input = bf.readLine().split(" ");
			numbers = new int[size];
			
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Integer.parseInt(input[i]);
			}
			
			input = null;
			
			local = local(numbers);
			global = global(numbers);
			
			numbers = null;
			
			if (local == global) {
				pw.println("YES");
				pw.flush();
			} else {
				pw.println("NO");
				pw.flush();
			}
			
			t--;
		}
	}
	
	public static int local(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i+1]) {
				count++;
			}
		}
		return count;
	}
	
	public static int global(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
