package cielAndABProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main24 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int a;
		int b;
		char[] answer;
		char[] options = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		input = bf.readLine().split(" ");
		bf = null;
		a = Integer.parseInt(input[0]);
		b = Integer.parseInt(input[1]);
		input = null;
		answer = Integer.toString(a - b).toCharArray();

		for (int i = 0; i < options.length; i++) {
			if (answer[0] != options[i]) {
				answer[0] = options[i];
				options = null;
				break;
			}
		}
		
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(new String(answer));
		
		answer = null;
		
		pw.flush();
		pw.close();
	}
}
