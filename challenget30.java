// Create a program to find the Least Common Multiple (LCM) of two 
//numbers.


import java.util.Scanner;

public class challenget30{

    public static void main (String args[]){
        
     Scanner scn = new Scanner(System.in); 


     System.out.print("enter the first number:");
     int num1 = scn.nextInt();

     System.out.print("enter the second number:");
     int num2 = scn.nextInt();


     int lcm;

     if(num1>num2){
        lcm = num1;
     }

     else{
        lcm = num2;
     }

            while (true) { 
         
           if(lcm % num1 == 0 && lcm % num2 == 0 ){
                   break;
                   
                  }

                  lcm++;

                }
     
       System.out.println("lcm of " + num1 + " and " + num2 + " =  is " + lcm);
    }
}