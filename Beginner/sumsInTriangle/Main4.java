package sumsInTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bf.readLine();
		int n = Integer.parseInt(s1);
		
		while (n > 0) {
			String s2 = bf.readLine();
			int m = Integer.parseInt(s2);
			while (m > 0) {
				String[] split = bf.readLine().split(" ");
				for (int i = 0; i < split.length; i++) {
					
				}
				m--;
			}
			n--;
		}
	}
}
