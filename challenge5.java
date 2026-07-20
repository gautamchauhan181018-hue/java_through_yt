//Create a java program to swap two number?

import java.util.Scanner;

public class challenge5{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the first value:");
    int a = scn.nextInt();

    System.out.print("enter the second value:");
    int b = scn.nextInt();

    int c = a;
    a = b;
    b = c;

    System.out.println("now value of a:" + a);
    System.out.println("now value of b:" + b);
    }
}
