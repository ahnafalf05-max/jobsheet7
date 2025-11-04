import java.util.Scanner;

public class TheTriangle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = 1; i <= numInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        input.close();
    }
}
    
 /* 
 1.Do a modification on the program therefore your program utilize FOR statement rather than WHILE statement. 
   Done
 2.Explain the meaning of s += “ *” and why is it possible? 
   It means:
	Take the current value of the string (s)
 	Append "*"  to the end of it 
    Store the new result back into (s)
    Because in Java:
 	The + operator is overloaded to work with strings.
 	When you use +  with strings, Java automatically performs concatenation
  */