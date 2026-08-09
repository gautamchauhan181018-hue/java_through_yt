//write a java program that show bitwise AND of two numbers.

import java.util.Scanner;
public class challenget19{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter a first value: ");
    int a = scn.nextInt();

    System.out.print("enter a second value:");
    int b = scn.nextInt();

    System.out.println("BITWISE AND =" + (a&b));

    }
}