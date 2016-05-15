package idAndShip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Main23 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String id = null;
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("B", "BattleShip");
		hashMap.put("C", "Cruiser");
		hashMap.put("D", "Destroyer");
		hashMap.put("F", "Frigate");
		hashMap.put("b", "BattleShip");
		hashMap.put("c", "Cruiser");
		hashMap.put("d", "Destroyer");
		hashMap.put("f", "Frigate");
		
		PrintWriter pw = new PrintWriter(System.out);
		
		while (n > 0) {
			id = bf.readLine();
			if (hashMap.containsKey(id)) {
				pw.println(hashMap.get(id));
			}
			n--;
		}
		pw.flush();
		pw.close();
	}
}
