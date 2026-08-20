// Create a program to sum all odd numbers from 1 to a specified number N

import java.util.Scanner;
public class challenget27{

    public static void main(String args[]){

    Scanner scn = new Scanner(System.in);

    System.out.print("enter the number:");
    int num = scn.nextInt();

    int sum = 0;


    for(int i = 1; i<=num; i++){

    if(i % 2 != 0){

     sum = sum + i;

    } 

    }    

    System.out.println("sum of all odd number is :" + sum);   
    }
}