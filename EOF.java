package com.company;

import java.util.Scanner;

public class EOF {

    public static void Print(){
        Scanner scanner = new Scanner(System.in);
        boolean h = scanner.hasNext();
        int r = 1;
        while(h == true){
            String s = scanner.nextLine();
            System.out.println(r + " "+ s);
            h = scanner.hasNext();
            r = r+1;
        }
    }
}
