package logic_java.logic_01;

import java.util.Scanner;

public class Question06C {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Masukan nilai n : ");
         int n = in.nextInt();

         int [] number = new int[n];
         for (int i = 0; i < n; i++) {
             number[i] = ( n * 3 ) - ( i * 3 ) ;
         }
         for (int value : number) {
             System.out.print(value + " ");
         }
    }
}
