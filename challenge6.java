//Create a program that takes two numbers and show result of all arithmetic operators (+,-,*,/,%)?

import java.util.Scanner;
public class challenge6{
    
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your first number:");
    int a = scn.nextInt();

    System.out.print("enter your second number:");
    int b = scn.nextInt();

    System.out.println("addition of two number is equal to:" + a+b);
    System.out.println("subtraction of two number is equal to:" +  (a-b));
    System.out.println("multiplication of two number is equal to:" + a*b);
    System.out.println("division of two number is equal to:" + a/b);
    System.out.println("modulus of two number is equal to:" + a%b);

    }

}