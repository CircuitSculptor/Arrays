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

        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a new number: ");
            int num = scanner.nextInt();
            arrayList.add(num);
            printArrayList(arrayList);
        }
    }

    public static void printArrayList(ArrayList<Integer> arrayList) {
        int count = 0;
        for (int element : arrayList) {
            //System.out.println("ArrayList Element: " + element);
            System.out.println("Element at index: " + count + ": " + element);
            count ++;
        }
    }
}
