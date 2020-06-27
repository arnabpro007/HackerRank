package com.company;

import java.util.Scanner;

public class JavaOutput {
    public static void Print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int v = 15-s1.length();
            int r=0;
            String temp = "";
            while (r<v){
                temp = temp + " ";
                r++;
            }
            s1 = s1 +temp;
            String s2 ;
            if(x>=100){
                s2 = ""+x;

            }else if(x>=10){
                s2 = "0"+x;
            }else{
                s2 = "00"+x;
            }
            System.out.println(s1+s2);
        }
        System.out.println("================================");
    }
}
