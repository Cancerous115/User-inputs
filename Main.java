//import java.ulti.Scanner;
import java.util.Scanner;
class Main{
  public static void main(String[]args){
    //Scanner used so we can identify and object, then we can take input from a user.
    //Also need to let it know that System.in is where we're getting our input from. 
    Scanner Scanner= new Scanner(System.in);
    
    //println will print on a seperate line, print will keep it on the same line.
    //We can also make the answer go to the next line by inserting "\n"in the text below.
    //Take strings as input for the user
    System.out.print("What is your name?");
    String name = Scanner.nextLine();
    //Can use println, or print
    //We can also use printf.
    //Also have methods for integers
    System.out.printf("Hello %s,how old are you?",name);
    //Also use int age=integer.parseInt(Scanner.nextLine());
    //same if we insert a double. double gpa = Double.parseDouble(Scanner.nextLine());
    int age =Scanner.nextInt();
    //Method Doubles:Scanner.nextDouble();
    //etc.... Specififers havfe their own methods aswell. 
    
    //Cleans up input buffer**
    Scanner.nextLine();
    //Specifiers. 
    System.out.printf("%d is a good age, what language do you prefer?",age);
    String language=Scanner.nextLine();

    System.out.printf("%s is a good language to learn",language);
    //Scanner is opened,but we must close it.
    Scanner.close();
  }
}