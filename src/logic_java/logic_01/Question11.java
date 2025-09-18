package logic_java.logic_01;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = in.nextInt();

        int [] randomNumber = new int[n];
        int number1 = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 ) {
                randomNumber[i] = number1;
                number1 += 2;
            } else {
                randomNumber[i] = number1;
                number1 *= 2;
            }
        }


        String [] mixed = new String[n];
        String buzz = "buzz";
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                mixed[i] = String.valueOf(randomNumber[index]);
                index++;
            } else {
                mixed[i] = buzz;
            }
        }
        for ( String value :mixed ) {
                System.out.print(value  + " ");
        }
    }
}
