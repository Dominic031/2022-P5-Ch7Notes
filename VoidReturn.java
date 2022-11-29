import java.util.Scanner;

public class VoidReturn {

   public static void main(String args[]){
   System.out.println(" we are going to add two numbers");
   System.out.println(" please enter them below");

   Scanner scan = new Scanner(System.in);
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();

           System.out.println(" your total is: "+ (num1 + num2)) ;
           int total = addNums();
           System.out.println("Your total again was: "+ total);
   }

   public static int addNums() {
      System.out.println(" we are going to add two numbers");
      System.out.println(" please enter them below");

      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      System.out.println(" your total is: " + (num1 + num2));
      return (num1 + num2);
   }


}
