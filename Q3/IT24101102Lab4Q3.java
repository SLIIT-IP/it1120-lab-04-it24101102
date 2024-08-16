import java.util.Scanner;
public class IT24101102Lab4Q3{
  public static void main(String[] args){
   Scanner n = new Scanner(System.in);
   System.out.println("Enter a number:");
   int number = n.nextInt();
   
   String result = (number>0)?" Positive":
                   (number<0)?" Negative":
                    " Zero";
   System.out.println("The number is" + result);
   
 }
}

