package racingHorses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main30 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		String[] input;
		int len = 0;
		int[] nums;
		
		int t = Integer.parseInt(bf.readLine());
		
		while (t > 0) {
			len = Integer.parseInt(bf.readLine());
			input = bf.readLine().split(" ");
			nums = new int[len];
			for (int i = 0; i < len; i++) {
				nums[i] = Integer.parseInt(input[i]);
			}
			
			Arrays.sort(nums);
			
			int diffMin = Integer.MAX_VALUE;
			int diff = 0;
			for (int i = 0; i < len-1; i++) {
				diff = Math.abs(nums[i] - nums[i+1]);
				if (diff < diffMin) {
					diffMin = diff;
				}
			}
			
			pw.println(diffMin);
			pw.flush();
			t--;
		}
		
		pw.close();
	}
}
