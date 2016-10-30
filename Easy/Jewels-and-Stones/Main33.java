package jewelsAndStones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class Main33 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(bf.readLine());
		char[] j;
		char[] s;
		int count;
		HashSet<Character> setJ;
		
		while (t > 0) {
			count = 0;
			j = bf.readLine().toCharArray();
			s = bf.readLine().toCharArray();
			setJ = new HashSet<Character>();
			
			for (int i = 0; i < j.length; i++) {
				setJ.add(j[i]);
			}
			
			for (int i = 0; i < s.length; i++) {
				if (setJ.contains(s[i])) {
					count++;
				}
			}
			
			pw.println(count);
			pw.flush();
			
			t--;
		}
		pw.close();
	}
}
