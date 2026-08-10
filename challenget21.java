//write a java program for bitwise xor?

import java.util.Scanner;

public class challenget21{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the value of a: ");
    int a = scn.nextInt();

    System.out.print("enter hte value of b:");
    int b = scn.nextInt();

    System.out.println("XOR value:" + (a^b));
    }
}