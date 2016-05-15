package enormousInputTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] split = s.split(" ");

		int n = Integer.parseInt(split[0]);
		int k = Integer.parseInt(split[1]);

		if (k >= 10000000) {
			return;
		}
		
		int count = 0;
		
		while (n > 0) {
			String s1 = bf.readLine();
			int x = Integer.parseInt(s1);

			if (x <= 1000000000) {
				if (x % k == 0) {
					count++;
				}
			} else {
				continue;
			}
			n--;
		}
		System.out.println(count);
	}
}
