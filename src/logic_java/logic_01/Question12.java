package logic_java.logic_01;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = in.nextInt();

        int[] arrayGanjil = new int[n];
        for (int i = 0; i < n; i++) {
            arrayGanjil[i] = i * 2 + 1;
        }

        int [] arrayReverse = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            arrayReverse[i] = arrayGanjil[index];
            if (index < 3){
                 index++;
            } else {
                index = 0;
            }
        }
        for (int value : arrayReverse) {
            System.out.print(value + " ");
        }


    }
}