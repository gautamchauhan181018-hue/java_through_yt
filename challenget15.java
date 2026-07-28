//create a java program that determines the greatest of the three number?

import java.util.Scanner;
class challenget15{

    public static void main (String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the values of a:");
    int a = scn.nextInt();

    System.out.print("enter the value of b:");
    int b = scn.nextInt();

    System.out.print("enter the value of c:");
    int c = scn.nextInt();

    if(a > b && a > c){
        System.out.println("a is greatest number");
    }
    else if(b > a && b > c){
        System.out.println("b is greatest number");
    }
    else {
        System.out.println("c is greatest number");
    }


    }
}