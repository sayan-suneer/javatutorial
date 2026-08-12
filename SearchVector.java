package sample;

import java.util.Scanner;
import java.util.Vector;

public class SearchVector {
    public static void main(String[] args) {

        Vector<String> items = new Vector<>();

        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an item name: ");
        String searchItem = scanner.nextLine();

        if (items.contains(searchItem)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        scanner.close();
    }
}