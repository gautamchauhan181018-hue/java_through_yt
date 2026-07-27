//create a program to calculate the area of triangle?

import java.util.Scanner;

public class challenge9{

    public static void main (String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your base of your triangle:");
    double b = scn.nextDouble();

    System.out.print("enter your height of your triangle: ");
    double h = scn.nextDouble();

    double area = 0.5 *b *h;
    System.out.print("Area of triangle is=" + area);

    }
}