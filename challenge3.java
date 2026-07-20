//create a program to input name of the person and respond with "welcome NAME to CodeaurKalamWorld"?

import java.util.Scanner;
public class challenge3{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your name:");
    String name = scn.nextLine();

    System.out.print("welcome " + name + "  to CodeAurKalamWorld");
    }
}