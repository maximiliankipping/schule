package task;

import java.util.Scanner;

public class Schaltjahr {


	public static void main(String[] args) {
		System.out.print("Bitte Jahr eingeben: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		if (isSchaltjahr(year))
			System.out.print(year + " ist ein Schaltjahr");

		else
			System.out.print(year + " ist kein Schaltjahr");

	}
	
	public static boolean isSchaltjahr(int year) 				// Die Methode zur Überprüfung, vom typ boolean
	{
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) // Kontrollabfrage mit booleschen Operatoren (s.u.)
			return true; 											// Rückgabe WAHR, wenn die Regeln zutreffen, -> Methode endet HIER
		return false; 												// Rückgabe FALSCH, else entfällt, da die Methode bei return autom. endet
	} 																	// Ende isSchaltjahr-Methode
}
