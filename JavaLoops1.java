package com.company;

import java.util.Scanner;

public class JavaLoops1 {
    public static void Print(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(N + "x" + i + " = "+ (N*i));
        }
    }
}
