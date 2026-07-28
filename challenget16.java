//create a program that determines if a given year is a leap year.

import java.util.Scanner;
class challenget16{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your year to check the leap year:");
    int year = scn.nextInt();

    if(year%4 == 0){
        System.out.println("your entered year is leap year:" + year);

    }
    else if(year%400 == 0){
        System.out.println("your entered year is leap year:" + year);
    }
    else{
        System.out.println("your entered year is non leap year:" + year);
    }    
    }
}