package arrangingCupcakes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main39 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(bf.readLine());
		int num;
		int temp;
		int diff;
		
		while (t > 0) {
			num = Integer.parseInt(bf.readLine());
			temp = Integer.MAX_VALUE;
			diff = Integer.MAX_VALUE;
			
			if (num == 2) {
				pw.println("0");
				pw.flush();
				t--;
				continue;
			}
			
			for (int i = 1; i <= (int)Math.sqrt(num); i++) {
				if (num % i == 0) {
					int k = num / i;
					temp = Math.abs(k - i);
					if (diff > temp) {
						diff = temp;
					}
				}
			}
			
			pw.println(diff);
			pw.flush();
			t--;
		}
		pw.close();
	}
}
