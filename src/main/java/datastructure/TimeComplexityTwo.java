package datastructure;

import java.util.Scanner;

public class TimeComplexityTwo {
    public static void main(String[] args) {
        System.out.println("Enter a number...");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        long count = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                count ++;
            }
        }
        for (int i = 0; i < number; i ++) {
            count ++;
        }
        System.out.println("count = " + count);
    }
}
