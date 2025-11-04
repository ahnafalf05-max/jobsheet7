import java.util.Scanner;

public class ForMultiples1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the multiple: ");
        int multiple = sc.nextInt();
        int sum = 0;
        int counter = 0;
        double average = 0.0; // 

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
        }

        if (counter > 0) {
            average = (double) sum / counter; 
        }

        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d.\n", multiple, sum);
        System.out.printf("The average of these multiples is %.2f.\n", average); 

        sc.close();
    }
}
    

/* 
1. There are 3 main components in FOR loop. Based on experiment 1 above, identify and explain these 3 components! 
int i = 1 Sets the starting value of i to 1. This runs once before the loop begins
i <= 50 Checks if i is less than or equal to 50. If true, the loop continues
i++ Increments 1 by 1 after each loop cycle. Ensures progress toward ending the loop
2. Done
3. */ 
