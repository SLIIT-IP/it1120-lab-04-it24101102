import java.util.Scanner;
public class IT24101102Lab4Q2{
  public static void main(String[] args){
  Scanner n = new Scanner(System.in);
  System.out.print("Pls enter exam marks (out of 100):");
  double examMarks = n.nextDouble();
  if (examMarks < 0 || examMarks > 100){
    System.out.println("Invalid input for exam marks. Terminating program.");
    return;
  }
  
  System.out.print("Pls enter lab submission marks(out of 100):");
  double labMarks = n.nextDouble();
  if (labMarks < 0 || labMarks > 100){
     System.out.println("Invalid input for lab submission marks. Terminating program.");
     return;
  }

  System.out.print("Pls enter the percentage given for the exam:");
  double examPercentage = n.nextDouble();
  
  System.out.print("Pls enter the percentage given for the lab submission: ");
  double labPercentage = n.nextDouble();
 
  if (examPercentage + labPercentage != 100){
    System.out.println("The percentages must add up to 100. Terminating program.");
    return;
  }
 
  double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
  
  System.out.println();
  System.out.println("Final Exam Mark is:" + finalMark);
 }
}

  