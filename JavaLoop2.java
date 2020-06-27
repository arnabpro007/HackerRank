package com.company;

import java.util.Scanner;

public class JavaLoop2 {
    public static void Print(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int r = a ;
            for(int j = 0;j<n;j++){
                r = r + (int)(Math.pow(2,j)*b);
                System.out.print(r +" ");
            }
            System.out.println();

        }
    }
}
