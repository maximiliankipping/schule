
public class HA1Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Initialisierung der Variablen und des Array
		        int[] array = {33,8,1,6,43,54};
		        int minDistanz = Integer.MAX_VALUE;
		        int index1 = 0;
		        int index2 = 0;
		        
		        //Überprüfen ob Array leer ist
		        if (array.length == 0) {
		            System.out.println("Array ist leer.");
		            return;
		        }
		        
		        //Überprüfen ob Array nur einen Eintrag hat
		        if (array.length < 2) {
		            System.out.println("Array ist zu klein.");
		            return;
		        }
		        
		        
		        
		        //Minimale Distanz berechnen
		        for (int i = 0; i < array.length - 1; i++) {
		            int distanz = Math.abs(array[i] - array[i + 1]);
		            if (distanz < minDistanz) {
		                minDistanz = distanz;
		                index1 = i;
		                index2 = i + 1;
		            }
		        }
		        
		        //Ausgabe
		        
		        System.out.println("Minimale Distanz: " + minDistanz + "(= " + array[index2] + " - " + array[index1]+")");
		        System.out.println("Indizes der Nachbarn: " + index1 + ", " + index2);
		        System.out.println("Nachbarn: " + array[index1] + ", " + array[index2]);
		


	}

}
