package task;

import java.util.Scanner;

public class Quadratzahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Zahl ein, von der das Quadrat gebildet werden soll: ");
		int zahl = sc.nextInt();
		sc.close();
		System.out.format("Das Quadrat von %d lautet: %.2f",zahl, quadrat(zahl));
		
	}
	
	public static double quadrat (int qzahl) {
		
		return Math.pow(qzahl, 2);
	}

}
