package theBlockGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main11 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(bf.readLine());
		
		String numberInput = null;
		ArrayList<Character> numberInputArrayList = null;
		ArrayList<Character> numberSortedArrayList = null;
		
		while (length > 0) {
			numberInput = bf.readLine();
			
			numberInputArrayList = new ArrayList<Character>();
			
			for (int i = 0; i < numberInput.length(); i++) {
				numberInputArrayList.add(numberInput.charAt(i));
			}
			
			numberSortedArrayList = new ArrayList<>(numberInputArrayList);
			
			Collections.reverse(numberSortedArrayList);
			
			if (numberInputArrayList.equals(numberSortedArrayList)) {
				System.out.println("wins");
			} else {
				System.out.println("losses");
			}
			
			length--;
		}
	}
}
