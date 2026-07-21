//Create a program to calculate perimeter of rectangle?
import java.util.Scanner;
public class challenge8{

    public static void main (String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your lenght of rectangle:");
    int l = scn.nextInt();

    System.out.print("enter your breadth of rectangle:");
    int b = scn.nextInt();

    System.out.print("perimeter of rectangle is:" + 2*(l+b));

    }
}