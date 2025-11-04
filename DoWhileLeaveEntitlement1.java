import java.util.Scanner;

public class DoWhileLeaveEntitlement1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int remainingEntitlement = 10;
        int requestedDays;

        while (true) {
            System.out.print("Enter number of leave days requested: ");
            requestedDays = input.nextInt();
            input.nextLine(); 

            if (requestedDays <= remainingEntitlement) {
                System.out.println("Leave approved for " + requestedDays + " days.");

                
                System.out.print("Type 't' to confirm and stop the program: ");
                String confirmation = input.nextLine();

                if (confirmation.equalsIgnoreCase("t")) {
                    System.out.println("Program stopped by user confirmation.");
                    break; 
                } else {
                    System.out.println("Confirmation not received. Returning to leave request.");
                }
            } else {
                System.out.println("Requested days exceed remaining entitlement (" + remainingEntitlement + " days). Please try again.");
            }
        }

        input.close();
    }
}
    
/* 
1.What is the use of the BREAK within the loop syntax?  
  The break statement in loop syntax is used to immediately exit the loop, regardless of whether the loop condition is still true. its a control flow tool that helps you stop the loop when a certain condition is met
2.Modify the program so that if the number of leave days requested is greater than the remaining entitlement, the program does not stop, allowing the user to enter the number of days according to the entitlement
  Done
3.Commit and push the program code to GitHub
  Done
4.When typing "t" as the confirmation input, what happens? Why?
error
"y" = yes
"n" = no
input "t" is not recognized
5.Modify the program code so that when the user enters "t" as the confirmation input, the program will stop
  Done
*/
