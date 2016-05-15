package squareRoot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		while (n > 0) {
			int number = Integer.parseInt(bf.readLine());
			long num = (long) number;
			long mid = 0;
			
			if(number == 1  || number == 2) {
				System.out.println(1);
				num = 0;
			}
			
			while(num >= 1) {
				if(num % 2 == 0) {
					mid = num / 2;
					//System.out.println("midddd" + mid);
				} else {
					mid = (num + 1) / 2;
					//System.out.println("midddd" + mid);
				}
				
				if(mid * mid > number) {
					num = mid;
				} else if(mid * mid == number) {
					System.out.println((int)mid);
					break;
				} else {
					long max = mid;
					long count = 0;
					for (long i = mid+1; i < num; i++) {
						
						if(i*i <= number) {
							max = i;
							count++;
						}
					}
					System.out.println((int)max + " " + count);
					break;
				}
			}
			n--;
		}
	}
}
