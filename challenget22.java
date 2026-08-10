//write a java program for bitwise not?

import java.util.Scanner;
public class challenget22{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the value of a: ");
    int a = scn.nextInt();

    System.out.println("NOT value = " + (~a));
        
    }
}