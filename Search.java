package sample;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println("Number found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        sc.close();
    }
}