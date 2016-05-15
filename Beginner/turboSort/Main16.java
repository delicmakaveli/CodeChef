package turboSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main16 {
	public static int[] array;
	public static int[] tempArray;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		PrintWriter pw = new PrintWriter(System.out);		
		array = new int[n];
		tempArray = new int[n];
		
		 // populates the array with input
		int i = 0;
		while (n > 0) {
			array[i] = Integer.parseInt(bf.readLine());
			i++;
			n--;
		}
		
		mergeSort(array, 0, array.length - 1);
		
		for (int j = 0; j < array.length; j++) {
			pw.println(array[j]);
		}
		pw.flush();
		pw.close();
	}
	
	public static void mergeSort(int[] aArray, int lowerIndex, int highIndex) {
		if (highIndex > lowerIndex) {
			int middle = (lowerIndex + highIndex) / 2;
			mergeSort(aArray, lowerIndex, middle);
			mergeSort(aArray, middle + 1, highIndex);
			merge(aArray, lowerIndex, middle, highIndex);
		}
	}

	public static void merge(int[] aArray, int lowerIndex, int middle, int highIndex) {
		//populate tempArray with input from array
		for (int i = lowerIndex; i <= highIndex; i++) {
			tempArray[i] = aArray[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		
		while(i <= middle && j <= highIndex) {
			if(tempArray[i] < tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			} else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		
		//in case there are elements left in the left half
		while(i <= middle) {
			array[k] = tempArray[i];
			i++;
			k++;
		}
		while(j <= highIndex){
			array[k] = tempArray[j];
			j++;
			k++;
		}
	}
}
