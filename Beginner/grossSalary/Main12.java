package grossSalary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main12 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bf.readLine());
		
		double base = 0;
		double hra = 0;
		double da = 0;
		double gross = 0;
		
		DecimalFormat df = new DecimalFormat("#.#");
		
		while (test > 0) {
			base = Double.parseDouble(bf.readLine());
			if(base < 1500) {
				hra = 0.1 * base;
				da = 0.9 * base;
			} else {
				hra = 500;
				da = 0.98 * base;
			}
			gross = base + hra + da;
			System.out.println(df.format(gross));
			
			test--;
		}
	}
}
