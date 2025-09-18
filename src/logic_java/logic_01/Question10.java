package logic_java.logic_01;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = in.nextInt();

        String [] mixed = new String[n];
        String fizz = "fizz";
        int number = 2;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 ){
                mixed [i] = String.valueOf(number);
                number *= 2;
            }else {
                mixed [i] = fizz;
            }
        }
        for (String value : mixed) {
            System.out.println(value + " ");
        }
    }


}
