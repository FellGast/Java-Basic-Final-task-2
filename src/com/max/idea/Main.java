package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String f;
        System.out.println("Введите уравение");
        Scanner sc = new Scanner(System.in);
        f = sc.nextLine();
        sc.close();

        int a;
        int b;

        if(f.charAt(0) == 'x')
        {
            a = f.charAt(2) - '0';
            b = f.charAt(4) - '0';
            if(f.charAt(1) == '-') a = -a;
            int r = b-a;
            System.out.println(String.format("%s", r));
        }
        if(f.charAt(2) == 'x')
        {
            a = f.charAt(0) - '0';
            b = f.charAt(4) - '0';
            if(f.charAt(1) == '-')
            {
                a = -a;
                b = -b;
            }
            int r = b-a;
            System.out.println(String.format("%s", r));
        }
        if(f.charAt(4) == 'x')
        {
            a = f.charAt(0) - '0';
            b = f.charAt(2) - '0';
            if(f.charAt(1) == '-')
            {
                b = -b;
            }
            int r = a+b;
            System.out.println(String.format("%s", r));
        }
    }
}
