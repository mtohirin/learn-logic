package logic_java.logic_01;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = input.nextInt();

        int [] ganjil = new int [n*n];
        for (int i = 0; i < n; i++) {
            ganjil[i] = i * 2 + 1;
        }
        int [] arrayReverse = new int [n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if ( i < (n / 2)){
                arrayReverse[i] = ganjil[index];
                index++;
            } else if (n % 2 == 1) {
                arrayReverse[i] = ganjil[index];
                index--;
            } else {
                index--;
                arrayReverse[i] = ganjil[index];

            }
        }
        for (int value : arrayReverse) {
            System.out.print(value + " ");
        }
    }
}
