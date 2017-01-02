package touristTranslations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main41 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		String[] init = bf.readLine().split(" ");
		
		int t = Integer.parseInt(init[0]);
		HashMap<Character, Character> guide = new HashMap<Character, Character>();
		char[] english = init[1].toCharArray();
		char[] bytelandian = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < bytelandian.length; i++) {
			guide.put(bytelandian[i], english[i]);
			guide.put(Character.toUpperCase(bytelandian[i]), Character.toUpperCase(english[i]));
		}
		guide.put('_', ' ');
		StringBuilder output;
		while (t > 0) {
			String input = bf.readLine();
			output = new StringBuilder();
			for (int i = 0; i < input.length(); i++) {
				char current = input.charAt(i);
				if (guide.containsKey(current)) {
					current = guide.get(current);
				}
				output.append(current);
			}
			pw.println(output.toString());
			pw.flush();
			t--;
		}
		pw.close();
	}
}
