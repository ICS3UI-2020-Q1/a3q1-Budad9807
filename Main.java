import java.util.Scanner;
/**
 * Finding the biggest integer out of three numbers
 * @David 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter three integers on separate lines");
    int choice1 = input.nextInt();
    int choice2 = input.nextInt();
    int choice3 = input.nextInt();
    if(choice1 > choice2){
     if (choice1 > choice3){
      System.out.println("choice1");
     }else {
      System.out.println("choice3");

     }
    }else {
      if(choice3 > choice2){
        System.out.println("choice3 was the greatest");


      }else{
        System.out.print("choice2");
      }
    }
    
  }
}
  