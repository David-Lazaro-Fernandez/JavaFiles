//This is my first program in java 
//This is a single line comment
/**This
 * is a 
 * multiple line 
 * comment :)
 */
//Today im introducing myself into Java! I'll learn how to read and print
//Also im gonna learn how to write a good code in java  
import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Reading a string
        System.out.print("Enter a name:");
        String text = input.next();
        System.out.println("The name you entered is: " + text);
        //Reading a integer
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The number you entered is: " + number);
        
    }
}