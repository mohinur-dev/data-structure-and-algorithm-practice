package datastructure;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {15, 76, 90, 12, 56, 50};
        System.out.println("Enter a number ...");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number found in index " + linearSearch(array, num));
    }
    public static int linearSearch(int array[], int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
