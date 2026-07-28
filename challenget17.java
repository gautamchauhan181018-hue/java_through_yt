//create a program that calculates grades based on marks?


import java.util.Scanner;
class challenget17{

      public static void main(String args[]){
      Scanner scn = new Scanner(System.in);

      System.out.print("entet the marks of sub1:");
      int sub1 = scn.nextInt();

      System.out.print("entet the marks of sub2:");
      int sub2 = scn.nextInt();

      System.out.print("entet the marks of sub3:");
      int sub3 = scn.nextInt();

      System.out.print("entet the marks of sub4:");
      int sub4 = scn.nextInt();

      System.out.print("entet the marks of sub5:");
      int sub5 = scn.nextInt();

      int total = sub1 + sub2 + sub3 + sub4 + sub5;

      float per = total/5;

      if(per>=90){
        System.out.println("Grade: outstanding");
      }
      else if(per>=75 && per<=89){
        System.out.println("Grade:A+");
      }
      else if(per>=60 && per<=74){
        System.out.println("GRade:A");
      }
       else if(per>=30 && per<=59){
        System.out.println("Grade: B");
       } 

       else if(per>=0 && per<=29){
        System.out.println("Grade:F");
       }
      


      }
}