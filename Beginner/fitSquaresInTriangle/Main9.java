package fitSquaresInTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		while (n > 0) {
			String base = bf.readLine();
			int b = Integer.parseInt(base);
			int result = 0;
			if(b < 4) {
				System.out.println(0);
			} else {
				int fact = (b / 2) - 1;
				while (fact > 0) {
					result += fact;
					fact --;
				}
				System.out.println(result);
			}		
			n--;
		}
	}
}
