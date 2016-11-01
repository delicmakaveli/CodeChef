package chefAndFeedback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main35 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(bf.readLine());
		String input;
		String substring;
		int hash1 = "010".hashCode();
		int hash2 = "101".hashCode();
		int subHash = 0;
		boolean flag = false;
		
		while (t > 0) {
			input = bf.readLine();
			
			if (input.length() < 3) {
				pw.println("Bad");
				pw.flush();
				t--;
				continue;
			}
			
			subHash = input.substring(input.length()-3).hashCode();
			if (hash1 == subHash || hash2 == subHash) {
				flag = true;
			}
			
			for (int i = 0; i < input.length() - 3; i++) {
				substring = input.substring(i, i+3);
				subHash = substring.hashCode();
				if (hash1 == subHash || hash2 == subHash) {
					flag = true;
					break;
				}
			}
			
			if (flag) {
				pw.println("Good");
			} else {
				pw.println("Bad");
			}
			flag = false;
			pw.flush();
			
			t--;
		}
		pw.close();
	}
}
