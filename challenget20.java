// write a java program that bitwise or of two numbers

import java.util.Scanner;

public class challenget20{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the first value:");
    int a = scn.nextInt();

    System.out.print("enter the second value:");
    int b = scn.nextInt();

    System.out.println("BITWISE OR = " + (a|b));

    }
}