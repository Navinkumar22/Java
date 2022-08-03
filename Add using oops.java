package com.company;
import java.util.Scanner;
class cal
{
    int a,b;
    public int add()
    {
        int c;
        Scanner s=new Scanner(System.in);
        System.out.print("value of x = ");
        a=s.nextInt();
        System.out.print("value of y =");
        b=s.nextInt();
        c=a+b;
        return c;
    }
}

public class Main {

    public static void main(String[] args) {
        cal c1= new cal();
        System.out.println("total = "+c1.add());


    }
}
