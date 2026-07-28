// create a program that categories a person into different age groups?

import java.util.Scanner;
class challenget18{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter your age:");
    int age = scn.nextInt();

    if(age<13){
        System.out.println("child");
    }
    else if(age>13 && age<=20){
        System.out.println("Teen");
    }
    else if(age>20 && age<60){
        System.out.println("Adult");
    }
    else{
        System.out.println("senior");
    }
    
    

    }
}