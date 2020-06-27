package com.company;

import java.util.Scanner;

public class JavaStatic {
    public static Scanner scanner = new Scanner(System.in);
    public static int B = scanner.nextInt();
    public static int H = scanner.nextInt();

    public static boolean flag = B>0 && H>0;
    static{
        if(flag == false){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void Print(){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

    }

