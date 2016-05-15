package mahasena;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main19 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = Integer.parseInt(bf.readLine());
		
		int nHalf = 0;
		if((n % 2) == 0) {
			nHalf = n / 2;
		} else {
			nHalf = (n / 2) + 1;
		}
		
		String[] inputArr = bf.readLine().split(" ");
		int[] weaponNum = new int[n];
		
		for (int i = 0; i < n; i++) {
			weaponNum[i] = Integer.parseInt(inputArr[i]);
		}
		
		int oddCount = 0;
		int evenCount = 0;
		boolean ready = true;
		
		for (int i = 0; i < n; i++) {
			if((weaponNum[i] % 2) == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			if(oddCount >= nHalf) {
				ready = false;
				break;
			}
			if(evenCount > nHalf) {
				break;
			}
		}
		
		if (ready) {
			pw.println("READY FOR BATTLE");
		} else {
			pw.println("NOT READY");
		}
		
		pw.flush();
		pw.close();
	}
}
