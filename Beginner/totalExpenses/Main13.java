package totalExpenses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main13 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bf.readLine());

		double quantity = 0;
		double price = 0;
		double expenses = 0;

		DecimalFormat df = new DecimalFormat("#.000000");
		
		String[] input = null;

		while (test > 0) {
			input = bf.readLine().split(" ");
			quantity = Double.parseDouble(input[0]);
			
			price = Double.parseDouble(input[1]);

			if (quantity > 1000) {
				expenses = quantity * price * 0.9;
			} else {
				expenses = quantity * price;
			}
			
			System.out.println(df.format(expenses));
			test--;
		}
	}
}
