package threeWayCommunications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int r;
		
		String[] chefInput = new String[2];
		String[] headInput = new String[2];
		String[] sousInput = new String[2];
		
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		
		double d12;
		double d13;
		double d23;
		
		int count;
		
		while (n > 0) {
			r = Integer.parseInt(bf.readLine());
			
			count = 0;
			
			chefInput = bf.readLine().split(" ");
			headInput = bf.readLine().split(" ");
			sousInput = bf.readLine().split(" ");
			
			x1 = Integer.parseInt(chefInput[0]);
			x2 = Integer.parseInt(headInput[0]);
			x3 = Integer.parseInt(sousInput[0]);
			
			y1 = Integer.parseInt(chefInput[1]);
			y2 = Integer.parseInt(headInput[1]);
			y3 = Integer.parseInt(sousInput[1]);
				
			d12 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
			d13 = Math.sqrt(((x1-x3)*(x1-x3)) + ((y1-y3)*(y1-y3)));
			d23 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
			
			if (d12 > r) {
				count++;
			}
			if (d13 > r) {
				count++;
			}
			if (d23 > r) {
				count++;
			}
			
			if (count <= 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			n--;
		}
	}
}
