//write a java program to calculate the simple interest?

import java.util.Scanner;
class challenge10{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the principal amount:");
    double p = scn.nextDouble();

    System.out.print("enter the rate of interest: ");
    double r = scn.nextDouble();

    System.out.print("enter the time:");
    double t = scn.nextDouble();

    double si = p*t*r/100;

    System.out.println("your simple interest is:" + si);

    }
}