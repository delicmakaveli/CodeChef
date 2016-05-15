package findRemainder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		while(n > 0) {
			String input = bf.readLine();
			String[] array = input.split(" ");
			
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			
			int result = a % b;
			
			System.out.println(result);
			n--;
		}
	}
}
