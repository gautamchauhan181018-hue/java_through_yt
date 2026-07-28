//create a program to convert fahrenheit to celcius

import java.util.Scanner;
class challenget12{

    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.print("enter the temperature(fahreheit)  to convert the in celcius:");
    int f = scn.nextInt();

    int c = (f-32)*5/9;

    System.out.println("your temperature in celsius:" + c);
    }
}