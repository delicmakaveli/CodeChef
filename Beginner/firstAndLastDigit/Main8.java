package firstAndLastDigit;

import java.io.*;

public class Main8 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String numOfIn = bf.readLine();
		int n = Integer.parseInt(numOfIn);
		
		while(n > 0) {
			String numberStr = bf.readLine();
			char[] array = numberStr.toCharArray();
			
			String first = Character.toString(array[0]);
			String last = Character.toString(array[array.length - 1]);
			
			int f = Integer.parseInt(first);
			int l = Integer.parseInt(last);
			
			System.out.println(f + l);
			n--;
		}
	}
}
