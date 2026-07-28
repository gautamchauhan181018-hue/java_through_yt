//create a program that determines if a number is positive,negative,or zero?

import java.util.Scanner;
class challenget13{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your number:");
    int num = scn.nextInt();

    if(num > 0){
        System.out.println("your number is positive");
    } 
    else if(num < 0){
        System.out.println("your number is negative");
    } 
    else{
        System.out.println("your number is zero");
    }  
    }
}