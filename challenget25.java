//write a java program to check even and odd using bitwise operator??

import java.util.Scanner;

public class challenget25{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the number:");
    int num = scn.nextInt();

    if((num & 1) == 0){
        System.out.println(num + " is even");
    }
    else{
        System.out.println(num +" is odd:");
    }
    }
}