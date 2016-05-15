package smallFactorial;

import java.io.*;
import java.math.BigInteger;

public class Main6 {
	
	static BigInteger bi1 = new BigInteger("1");
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = Integer.parseInt(bf.readLine());
		
		BigInteger bi;
		
		while (n > 0) {
			bi = new BigInteger(bf.readLine());
			pw.println(factorial(bi));
			n--;
		}
		bf = null;
		bi = null;
		pw.flush();
		pw.close();
	}
	
	public static BigInteger factorial(BigInteger big) {
		if (big.compareTo(bi1) == 0) {
			return bi1;
		}
		return big.multiply(factorial(big.subtract(bi1)));
	}
}
