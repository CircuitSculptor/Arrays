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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a new number: ");
        int newValue = scanner.nextInt();

        arrayList.add(newValue);

        printArrayList(arrayList);
    }

    public static void printArrayList(ArrayList<Integer> arrayList) {
        for (int element : arrayList) {
            System.out.println("ArrayList Element: " + element);
        }
    }
}
