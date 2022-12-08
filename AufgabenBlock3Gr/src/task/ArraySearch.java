package task;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, -3, 18};
	    int pos = -1;
	    for (int i = 0; i < array.length; i++) {
	      if (array[i] == -3) {
	        pos = i;
	        break;
	      }
	    }
	    System.out.println("Position: " + pos);

	}

}
