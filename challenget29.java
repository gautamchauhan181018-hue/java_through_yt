// Create a program that computes the sum of the digits of an integer


import java.util.Scanner;

public class challenget29{

    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the number: ");
    int num = scn.nextInt();

    int sum = 0;

    while(num != 0){
        sum = sum + num % 10;
        num = num /10;  
    }

    System.out.println("sum of all digit : " + sum);

    }
    
    }
