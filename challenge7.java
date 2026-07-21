//Create a program to calculate product of two floating points numbers?
import java.util.Scanner;

public class challenge7{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your first float number:");
    float a = scn.nextFloat();

    System.out.print("enter your second float number");
    float b = scn.nextFloat();

    System.out.println("product of two number is: " + a*b);
    }
}