package simpleStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main22 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintWriter pw = new PrintWriter(System.out);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] input;
		int numsToRmv;
		int numOfNums;
		while (n > 0) {
			input = bf.readLine().split(" ");
			numOfNums = Integer.parseInt(input[0]);
			numsToRmv = Integer.parseInt(input[1]);
			input = bf.readLine().split(" ");
			double[] nums = new double[numOfNums];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Double.parseDouble(input[i]);
			}
			input = null;
			Arrays.sort(nums);
			double sum = 0;
			for (int i = numsToRmv; i < nums.length - numsToRmv; i++) {
				sum += nums[i];
			}
			nums = null;
			double avg = sum / (numOfNums - (2 * numsToRmv));
			DecimalFormat df = new DecimalFormat("0.000000");
			pw.println(df.format(avg));
			df = null;
			n--;
		}
		pw.flush();
		pw.close();
	}
}
