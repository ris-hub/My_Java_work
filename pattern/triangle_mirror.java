package com.pattern;

import java.util.Scanner;

public class triangle_mirror {
    public  void pattern(int n) {
        int i, j, k ,l,m;
        m=n;
        for (i = 0; i < n; i++)
        {
            for (k = 0; k < i; k++)
            {
                System.out.print(" ");
            }
            for (j = n; j >i; j--)
            {
                System.out.print("*");
            }
            for(l=m-1;l>0;l--)
            {
                System.out.print("*");
            }
            m--;
            System.out.println();
        }
        for (i = 1; i < n; i++)
        {
            for (j = n-1; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 0; k < i+1; k++)
            {
                System.out.print("*");
            }
            for (l= 0; l < i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        triangle_mirror ob = new triangle_mirror();
        ob.pattern(n);
    }
}
