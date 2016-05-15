package lifeUniverseAndEverything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main0 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = true;
		String s;
		while (loop) {
			 s = bf.readLine();
			
			if(s.equals("42")) {
				loop = false;
			} else {
				System.out.println(s);
			}
		}
	}
}