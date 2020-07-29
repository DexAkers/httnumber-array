import java.io.IOException;
import java.util.Scanner;

public class regnumarray {
    public static int[] getArray() {
        Scanner input = new Scanner(System.in);  //scan for user input
        System.out.println("Enter data for the array: ");
        String userinput = input.nextLine();
        String[] array = userinput.split(" ");
        final int SIZE = array.length;
        int[] finalArray = new int[SIZE]; //returning initial array

        // creates integer array from string array
        for (int i = 0; i< SIZE; i++){
            finalArray[i] = Integer.parseInt(array[i]);
        }

        input.close();
        return finalArray;
    }

    //Print the Array
    public static void printArray (int[] array) {
        System.out.println("There are " + array.length + " elements in the array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + (i+1) +": " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] myArray = getArray();
        printArray(myArray);
        }
}