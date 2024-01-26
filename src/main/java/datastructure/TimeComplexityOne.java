package datastructure;

import java.util.Scanner;

public class TimeComplexityOne {
    public static void main(String[] args) {
        System.out.println("Enter a number...");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        long count = 0;
        //single loop time complexity O(n)
//        for (int i = 0; i < number; i ++) {
//            count ++;
//        }

        //double loop time complexity n square
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                count ++;
//            }
//        }

        //triple loop time complexity n square
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {
                count ++;
                }
            }
        }
        System.out.println("count = " + count);
    }
}
