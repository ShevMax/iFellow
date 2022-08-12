import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String word = "Hello";
        System.out.println("The word is:" + word);

        word = word.toLowerCase();
        char array[] = word.toCharArray();

        System.out.print("Duplicate characters in above word are: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                    break;
                }
            }
        }
    }
}