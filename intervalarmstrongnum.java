import java.util.Scanner;
public class ArmstrongBetweenTwoNumbers 
{
   public static void main(String args[])
   {
      int a1, a2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      a1 = sc.nextInt();
      System.out.println("Enter the second number ::");
      a2 = sc.nextInt();

      for (int i = a1; i<a2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i)
         {
            System.out.println(""+i+" is an Armstrong number.");
         }
      }
   }
}
