package task;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearch(int[] array, int element) {
		// Sortiere das Array mit der sort-Methode aus der Arrays-Klasse
		Arrays.sort(array); //eigentlich Bubblesort nutzen -> noch ändern

		// Führe die binäre Suche durch
		int low = 0;
		int high = array.length - 1;
		while (low <= high) { //oder bei high ohne -1 und dafür bei while low!=high
			int mid = (low + high) / 2;
			if (array[mid] < element) {
				low = mid + 1;
			} else if (array[mid] > element) {
				high = mid - 1;
			} else {
				// Element gefunden
				return mid;
			}
		}

		// Element nicht gefunden
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Erstelle ein Array und führe die binäre Suche durch
		int[] array = {-3, 70, 29, 40, 2, 80};
		int pos = binarySearch(array, 2);
		if (pos >= 0) {
			System.out.println("Das Element wurde an Position " + pos + " gefunden.");
		} else {
			System.out.println("Das Element wurde nicht gefunden.");
		}

	}

}
