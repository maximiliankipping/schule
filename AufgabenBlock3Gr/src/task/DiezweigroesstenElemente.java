package task;

public class DiezweigroesstenElemente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array={11, 12, 5, 7, 4, 1, -3, 8, -2};
		
		int index1 = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                index1 = i;
                max1 = array[i];
            }
        }

        for (int i = 0; i < index1; i++) {
            if (array[i] > max2) {
                max2 = array[i];
            }
        }
        for (int i = index1 + 1; i < array.length; i++) {
            if (array[i] > max2) {
                max2 = array[i];
            }
        }

        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
		

	}

}
