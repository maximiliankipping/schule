package task;

import java.util.Scanner;

public class Restdivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		int zahl1 = sc.nextInt();
		
		System.out.println("Bitte geben Sie die zweite Zahl ein: ");
		int zahl2 = sc.nextInt();
		sc.close();
		
		System.out.format("Das Ergebnis von %d durch %d lautet: %d \n",zahl1,zahl2, division(zahl1,zahl2));
		System.out.println();
		System.out.format("Der Rest von %d durch %d lautet: %d",zahl1,zahl2, rest(zahl1,zahl2));

	}
	
	public static int division(int zahl1, int zahl2) {
		int ergebnis = zahl1 / zahl2;
		return ergebnis;
	}
	
	public static int rest(int zahl1, int zahl2) {
		int drest = zahl1 % zahl2;
		return drest;
	}

}
