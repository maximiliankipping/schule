package task;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlen = { 42, 69, 420, 187, 1337, -5, 0 };
		//bubblesort(zahlen);
		bubblesortOptimized(zahlen);
		

	}

	public static void bubblesortOptimized(int [] array) {
		
		boolean swapped;
		
		do { //Ersatz fuer auessere for-Schleife (do while)
			swapped = false;
			
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] < array[i+1]) {
					swap(array, i, i+1);
					swapped = true;
				}
			}
		}while(swapped);
		//Ausgabe
		for (int z : array) {
			System.out.print(z + " ");
		}
	}

	public static void bubblesort(int[] array) {
		for (int i = 1; i < array.length; i++) { // auessere Schleife: Runden der Durchführung von Bubblesort
			for (int j = 0; j < array.length - i; j++) { // innere Schleife: Zuständig für Swap
				// Vergleich
				if (array[j] < array[j + 1]) {
					// SWAP
					swap(array, j, j + 1);
				}
			}
		}
		//Ausgabe
		for (int z : array) {
			System.out.print(z + " ");
		}
	}

	private static void swap(int[] array, int a, int b) {
		// Dreiecksvergleich
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
