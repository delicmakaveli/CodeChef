package cookingMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main23 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] input;
		int v;
		int d;
		PrintWriter pw = new PrintWriter(System.out);
		while (n > 0) {
			input = bf.readLine().split(" ");
			v = Integer.parseInt(input[0]);
			d = Integer.parseInt(input[1]);
			input = null;
			v = cookingMachine(v, d);
			pw.println(v);
			n--;
		}
		bf = null;
		pw.flush();
		pw.close();
	}

	public static int cookingMachine(int value, int desired) {
		int counter = 0;
		int v = value;
		int d = desired;
		
		if (v==d) {
			return 0;
		} else if (d == 1) {
			while (v !=d) {
				if (v % 2 == 0) {
					v = v / 2;
				} else {
					v = (v-1) / 2;
				}
				counter++;
			}
			return counter;
		} else if (v == 1) {
			while (v !=d) {
				v = v * 2;
				counter++;
			}
			return counter;
		} else if (v % 2 != 0) {
			while (v != d && v != 1) {
				if (v % 2 == 0) {
					v = v / 2;
				} else {
					v = (v-1) / 2;
				}
				counter++;
				if ((d/v) % 2 == 0) {
					while(v != d) {
						v = v * 2;
						counter++;
					}
					break;
				}
			}
			return counter;
		} else if (v > d) {
			while (v !=d) {
				if (v % 2 == 0) {
					v = v / 2;
				} else {
					v = (v-1) / 2;
				}
				counter++;
			}
			return counter;
		} else {
			while (v !=d) {
				v = v * 2;
				counter++;
			}
			return counter;
		}
	}
}
