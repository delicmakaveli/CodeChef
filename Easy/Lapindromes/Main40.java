package lapindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main40 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(bf.readLine());
		String input = null;
		int len = 0;
		short[] firstHalf;
		short[] secondHalf;
		boolean output;
		
		while (t > 0) {
			output = true;
			len = 0;
			input = bf.readLine();
			len = input.length();
			firstHalf = new short[36];
			secondHalf = new short[36];
			for (int i = 0; i < 36; i++) {
				firstHalf[i] = 0;
				secondHalf[i] = 0;
			}	
			
			if (len % 2 == 0) {
				for (int i = 0; i < len/2; i++) {
					int index = Character.getNumericValue(input.charAt(i));
					firstHalf[index] += 1;
				}
				for (int i = len/2; i < len; i++) {
					int index = Character.getNumericValue(input.charAt(i));
					secondHalf[index] += 1;
				}
			} else {
				for (int i = 0; i < len/2; i++) {
					int index = Character.getNumericValue(input.charAt(i));
					firstHalf[index] += 1;
				}
				for (int i = (len/2)+1; i < len; i++) {
					int index = Character.getNumericValue(input.charAt(i));
					secondHalf[index] +=1;
				}
			}
			
			for (int i = 0; i < 36; i++) {
				if (firstHalf[i] != secondHalf[i]) {
					output = false;
					break;
				}
			}
			if (output) {
				pw.println("YES");
			} else {
				pw.println("NO");
			}
			pw.flush();
			t--;
		}
		pw.close();
	}
}
