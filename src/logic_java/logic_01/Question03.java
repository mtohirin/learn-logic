package logic_java.logic_01;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai n :");
        int n = input.nextInt();

        int [] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i*3+3;
        }
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}
