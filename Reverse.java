package sample;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements in same order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray elements in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}