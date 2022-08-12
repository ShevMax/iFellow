import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int a = 10;
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        int max = array[0];
        int min = array[0];
		double sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            sum += array[i];
        }
		double avg = sum / array.length;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + avg);
        //System.out.print ("Array = " + Arrays.toString(array));
    }
}
