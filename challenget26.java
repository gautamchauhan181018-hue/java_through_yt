// Develop a program that prints the multiplication table for a given number


import java.util.Scanner;

public class challenget26{

public static void main(String args[]){
Scanner scn = new Scanner(System.in);

System.out.print("enter the number for multiplication:");
int a = scn.nextInt();


for(int i = 1; i<11; i++){

System.out.println( a + " X " + i + " = "  + a*i );

}
    
}

}