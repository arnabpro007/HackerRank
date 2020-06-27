package com.company;

import java.util.Scanner;

public class JavaDataType {
    public static void Print(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t;i++){
            try {
                long x = sc.nextLong();
                System.out.println(x +" can be fitted in:" );
                if(x>= -128 && x<=127){
                    System.out.println("* byte");
                }
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647) System.out.println("* int");
                System.out.println("* long");


            }
            catch (Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
