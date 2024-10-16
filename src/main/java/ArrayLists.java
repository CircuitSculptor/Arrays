import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);

        printArrayList(arrayList);

        // Prompt user for a new value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new value to add: ");
        int newValue = scanner.nextInt();

        arrayList.add(newValue);

        printArrayList(arrayList);
    }

    // Method to print ArrayList using enhanced for loop
    public static void printArrayList(ArrayList<Integer> arrayList) {
        for (int element : arrayList) {
            System.out.println("ArrayList Element: " + element);
        }


        //ArrayList<Integer> numbers = new ArrayList<Integer>();



        /*
        public static void printArrayList(ArrayList<Integer> arrayList) {
            for (int element : arrayList) {
                System.out.println("ArrayList Element: " + element);
            }
        }

         */

    }
}
