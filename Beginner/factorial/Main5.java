package factorial;

import java.io.*;

public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String numOfIn = bf.readLine();
		int n = Integer.parseInt(numOfIn);
		
		while (n > 0) {
			String inputValue = bf.readLine();
			int inputNumber = Integer.parseInt(inputValue);
			//System.out.println(inputNumber);
			
			int zerosCounter = 0;
			while (inputNumber > 0) {
				zerosCounter = zerosCounter +  (inputNumber / 5);
				inputNumber = inputNumber / 5;
			}
	        System.out.println(zerosCounter);
	        
			n--;
		}
	}
}
