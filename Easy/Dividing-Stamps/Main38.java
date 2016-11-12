package dividingStamps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main38 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = Integer.parseInt(bf.readLine());
		String[] input = bf.readLine().split(" ");
		bf = null;
		int[] brojevi = new int[n];
		
		for (int i = 0; i < input.length; i++) {
			brojevi[i] = Integer.parseInt(input[i]);
		}
		input = null;
		
		n = 0;
		int sum = 0;
		for (int i = 0; i < brojevi.length; i++) {
			n += i+1;
			sum += brojevi[i];
		}
		
		if (sum == n) {
			pw.println("YES");
		} else {
			pw.println("NO");
		}
		pw.flush();
		pw.close();
	}
}
