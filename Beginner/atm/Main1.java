package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] splitInput = s.split(" ");
		
		int wit = Integer.parseInt(splitInput[0]);
		double acc = Double.parseDouble(splitInput[1]);
		
		if(wit % 5 == 0 && wit <= acc - 0.5) {
			acc = acc - wit - 0.5;
			System.out.println(acc);
		} else {
			System.out.println(acc);
		}
		
	}
}
