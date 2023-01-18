import java.util.Arrays;

public class HA2 {

	//Übergabe des zweidimensionalen Arrays und Ausgabe der minimalen Distanz
		public static void main(String[] args) {
	        int[][] points = {{3,7}, {30,80}, {80,320}, {15,276}, {84,298}, {19,29}, {200,200}, {191,919}};
	        System.out.println("Die Indexe (" + Arrays.toString(minDistanz(points)) + ") haben die kleinste Distanz zueinander");
	    }
		
		
		//Übergabe der Werte an distance und Überprüfen ob Distanz < minDistanz
		public static int[] minDistanz(int[][] points) {
	        int minIndex1 = 0, minIndex2 = 1;
	        double minDistanz = distanz(points[0], points[1]);
	        for (int i = 0; i < points.length; i++) {
	            for (int j = i + 1; j < points.length; j++) {
	                double distanz = distanz(points[i], points[j]);
	                if (distanz < minDistanz) {
	                    minDistanz = distanz;
	                    minIndex1 = i;
	                    minIndex2 = j;
	                }
	            }
	        }
	        return new int[] {minIndex1, minIndex2};
	    }
	    
		//Berechnung von Distanz
	    public static double distanz(int[] point1, int[] point2) {
	        int xDiff = point1[0] - point2[0];
	        int yDiff = point1[1] - point2[1];
	        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	    }

}
