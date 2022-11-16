package task;

import java.util.Arrays;

public class Kaffeemaschine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] messwerte = {248, 249, 251,247, 250, 252, 246, 248, 249, 250};
		int gesamtMenge = 0;
		int durchschnitt = 0;
		int abweichung = 0;
		
		//System.out.println(Arrays.toString(messwerte));
		//Aufgabe 1 a
		System.out.print("Nummer der Messung: ");
		System.out.println("tatsächliche Füllmenge:");
		for (int a = 0; a<messwerte.length; a++) {
			int m = a+1;
			System.out.print(m+ "	");
			System.out.print("			");
			System.out.println(messwerte[a]);
			gesamtMenge += messwerte[a];
		}
		
		
		
		//Aufgabe 1 b
		System.out.println("Gesamtmenge: "+gesamtMenge+" ml");
		
		//Aufgabe 1 c
		durchschnitt = gesamtMenge / 10;
		System.out.println("Durchschnitt: "+durchschnitt+" ml");
		
		//Aufgabe 1 d --> so nicht richtig --> überarbeiten
		
		if (durchschnitt > 250) {
			abweichung =  durchschnitt - 250;
		}else {
			abweichung = 250 - durchschnitt;
		}
		
		System.out.println("Abweichung: " +abweichung+ " ml");
		
		//Aufgabe 1 e
		
		for (int m = 0; m<messwerte.length; m++) {
			if (messwerte[m] > 246 && messwerte[m] < 250) {
				System.out.println("Messwert: "+messwerte[m]+" ml");
			}else {
				System.out.println("Wert liegt nicht im vorgegebenen Bereich.");
			}
				
		}
		
		//Aufgabe 1 f
		System.out.println("Messwerte rückwärts ausgegeben: ");
		for (int m = 9; m >= 0; m--) {
			System.out.print(messwerte[m]+" ");
		}
		
		//Aufgabe 1 g
		//in der Art machen:
		//int temp = z[3]
		//z[3] = z[0]
		//z[0] = temp

	}

}
