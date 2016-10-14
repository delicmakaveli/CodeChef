package cleaningUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main29 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(bf.readLine());
		int[] input1 = new int[2];
		int[] input2;
		while (t > 0) {
			String[] input = bf.readLine().split(" ");
			input1[0] = Integer.parseInt(input[0]);
			input1[1] = Integer.parseInt(input[1]);
			input = null;
			input = bf.readLine().split(" ");
			input2 = new int[input1[1]];
			
			for (int i = 0; i < input2.length; i++) {
				input2[i] = Integer.parseInt(input[i]);
			}
			
			input = null;
			int[] jobs = new int[input1[0] - input1[1]];
			int num = 0;
			boolean flag = true;
			
			for (int i = 0; i < jobs.length; i++) {
				flag = true;
				num += 1;
				for (int j = 0; j < input2.length; j++) {
					if (num == input2[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					jobs[i] = num;
				} else{
					i--;
				}	
			}
			String chef = "";
			String suchef = "";
			for (int i = 0; i < jobs.length; i+=2) {
				chef += jobs[i] + " ";
				if (i+1 < jobs.length ) {
					suchef += jobs[i+1] + " ";
				}
			}
			pw.println(chef);
			pw.println(suchef);
			pw.flush();
			t--;
		}
		pw.close();
	}
}
