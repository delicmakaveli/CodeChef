package chefAndHisSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Hashtable;

public class Main18 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		int[] array = null;
		int[] subArray = null;
		int arrayLength = 0;
		int subLength = 0;
		String[] arr = null;
		int [] tempArray = null;
		
		Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
		
		while (n > 0) {
			arrayLength = Integer.parseInt(bf.readLine());
			array = new int[arrayLength];
			arr = new String[arrayLength];
			arr = bf.readLine().split(" ");
			for (int i = 0; i < arrayLength; i++) {
				array[i] = Integer.parseInt(arr[i]);
			}
			arr = null;
			tempArray = array;
			Arrays.sort(tempArray);
			
			subLength = Integer.parseInt(bf.readLine());
			subArray = new int[subLength];
			arr = new String[subLength];
			arr = bf.readLine().split(" ");
			for (int i = 0; i < subLength; i++) {
				subArray[i] = Integer.parseInt(arr[i]);
			}
			arr = null;
			
			short yes = 0;
			short no = 0;
			
			// O.C.
			
			int loc = 0;
			
			for (int i = 0; i < arrayLength; i++) {
				hashTable.put(i, binarySearch(tempArray, subArray[i]));
			}
			
			for (int i = 0; i < subLength; i++) {
				hashTable.put(i, binarySearch(tempArray, subArray[i]));
			}
			
			for (int i = 0; i < arrayLength; i++) {
			}
			if (loc == -1) {
				System.out.println("No");
			} else {
				if (loc + subLength - 1 <= arrayLength - 1) {
					int j = 0;
					for (int i = loc; i <= loc + subLength - 1; i++) {
						if (array[loc] != subArray[j]) {
							//System.out.println("No");
							no = 1;
							break;
						} else {
							
						}
					}
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
			n--;
		}
	}

	public static int binarySearch(int[] aArray, int target) {
		int left = 0;
		int right = aArray.length - 1;
		int mid = 0;
		while (right >= left) {
			mid = (right + left) / 2;
			if (aArray[mid] == target) {
				return mid;
			} else if (aArray[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
