package discrepanciesInVotersList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main34 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = bf.readLine().split(" ");
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int n1 = Integer.parseInt(input[0]);
		int n2 = Integer.parseInt(input[1]);
		int n3 = Integer.parseInt(input[2]);
		
		input = null;
		
		int[] array1 = new int[n1];
		int i = 0;
		
		while (n1 > 0) {
			array1[i] = Integer.parseInt(bf.readLine());
			i++;
			n1--;
		}
		
		i = 0;
		int[] array2 = new int[n2];
		while (n2 > 0) {
			array2[i] = Integer.parseInt(bf.readLine());
			i++;
			n2--;
		}
		
		i = 0;
		int[] array3 = new int[n3];
		while (n3 > 0) {
			array3[i] = Integer.parseInt(bf.readLine());
			i++;
			n3--;
		}
		
		bf = null;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int j = 0; j < array1.length; j++) {
			if (map.containsKey(array1[j])) {
				map.put(array1[j], map.get(array1[j])+1);
			} else {
				map.put(array1[j], 1);
			}
			set.add(array1[j]);
		}
		for (int j = 0; j < array2.length; j++) {
			if (map.containsKey(array2[j])) {
				map.put(array2[j], map.get(array2[j])+1);
			} else {
				map.put(array2[j], 1);
			}
			set.add(array2[j]);
		}
		for (int j = 0; j < array3.length; j++) {
			if (map.containsKey(array3[j])) {
				map.put(array3[j], map.get(array3[j])+1);
			} else {
				map.put(array3[j], 1);
			}
			set.add(array3[j]);
		}
		
		List<Integer> brojevi = new ArrayList<Integer>();
		for (Integer integer : set) {
			brojevi.add(integer);
		}
		Collections.sort(brojevi);
		
		List<Integer> output = new ArrayList<Integer>();
		for (Integer integer : brojevi) {
			if (map.get(integer) >= 2) {
				output.add(integer);
			}
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(output.size());
		for (Integer integer : output) {
			pw.println(integer);
			pw.flush();
		}
		pw.close();
	}
}
