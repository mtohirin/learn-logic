package logic_java.logic_01;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai n :");
        int n = input.nextInt();

        int [] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = i*2+2;
        }
        for (int value : number) {
            System.out.print(value + " ");
        }
    }
}
