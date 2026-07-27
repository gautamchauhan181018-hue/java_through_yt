//write a java program to print or calcualte the compound interest?

import java.util.Scanner;
class challenge11{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

     System.out.print("enter the principal amount:");
     double p = scn.nextDouble();

     System.out.print("enter the rate of interest:");
     double r = scn.nextDouble();

     System.out.print("enter the time:");
     double t = scn.nextDouble();

     double amount = p*Math.pow((1+r/100),t);

     double ci = amount - p;

     System.out.println("compound interest:" + ci);
     System.out.println("total amount:" + amount);
    }
}