package logic_java.logic_01;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = in.nextInt();

        int [] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] =( n * 2 ) - ( i * 2);
        }
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}
