package coinFlip;

import java.io.*;

public class Main31 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(bf.readLine());
		byte[] coins;
		int g = 0;
		byte initialState = 0;
		int numOfCoins = 0;
		byte guessTarget = 0;
		
		
		while (t > 0) {
			g = Integer.parseInt(bf.readLine());
			
			while (g > 0) {
				String[] input = bf.readLine().split(" ");
				initialState = Byte.parseByte(input[0]);
				numOfCoins = Integer.parseInt(input[1]);
				guessTarget = Byte.parseByte(input[2]);
				
				input = null;
				
				coins = new byte[numOfCoins];
				
				for (int i = 0; i < coins.length; i++) {
					coins[i] = initialState;
				}
				
				for (int i = 0; i < coins.length; i++) {
					for (int j = 0; j <= i; j++) {
						if (coins[j] == 1) {
							coins[j] = 2;
						} else {
							coins[j] = 1;
						}
					}
				}
				
				int count = 0;
				
				for (int i = 0; i < coins.length; i++) {
					if (coins[i] == guessTarget) {
						count++;
					}
				}
				
				pw.println(count);
				pw.flush();
				
				g--;
			}
			t--;
		}
		pw.close();
	}
}
