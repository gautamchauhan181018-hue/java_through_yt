// Write a function that calculates the factorial of a given number

import java.util.Scanner;

public class challenget28{

    public static void main(String args[]){

     Scanner scn = new Scanner(System.in);

    System.out.print("enter the given number: ");
    int num = scn.nextInt();


    int store = 1;

    for(int i = 1; i<=num;i++){

    store = store*i;

    }

    System.out.println("factorial of " + num + " = " + store);
    }
}