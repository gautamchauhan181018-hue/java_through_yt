//create a java program that detrmines if a number is odd or even?

import java.util.Scanner;
class challenget14{

public static void main(String args[]){
Scanner scn = new Scanner(System.in);

System.out.print("enter the number:");
int a = scn.nextInt();

if(a%2==0){
    System.out.println("your number is even");

}
else{
    System.out.println("your number is odd");
    
}
}
}