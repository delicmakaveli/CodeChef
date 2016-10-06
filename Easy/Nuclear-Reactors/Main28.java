package nuclearReactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main28 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] in = bf.readLine().split(" ");
		
		int numOfParticles = Integer.parseInt(in[0]);
		int limitOfReactor = Integer.parseInt(in[1]);
		int numOfReactors = Integer.parseInt(in[2]);
		int[] reactors = new int[numOfReactors];
		
		while(numOfParticles > 0) {
			reactors[0] ++;
			numOfParticles--;
			for (int i = 0; i < numOfReactors; i++) {
				if (reactors[i] > limitOfReactor) {
					reactors[i] = 0;
					if (i+1 == numOfReactors) {
						break;
					}
					reactors[i+1] ++;
				}
			}
		}
		
		//PrintWriter pw = new PrintWriter(System.out);
		String output = Integer.toString(reactors[0]);
		for (int i = 1; i < numOfReactors; i++) {
			output += " " + reactors[i];
		}
		System.out.println(output);
		//pw.print(output);
		//pw.flush();
		//pw.close();
	}
}
