//write a java program for left shift bitwise operator

import java.util.Scanner;
public class challenget23{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the value of a: ");
    int a  = scn.nextInt();

    System.out.print("left shift value: "+ (a<<1));    
    } 
}