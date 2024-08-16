import java.util.Scanner;
public class IT24101102Lab4Q1{
  public static void main(String[] args){
   Scanner n = new Scanner(System.in);
   System.out.println("Enter a number:");
   int number = n.nextInt();
   
   if (number>0){
   System.out.println("The number is Postive");
   }
   else if(number<0){
   System.out.println("The number is Negative");
   }
   else{
   System.out.println("The number is zero");
   }
 }
}

   