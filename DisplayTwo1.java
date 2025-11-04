import java.util.Scanner;

public class DisplayTwo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input some number: ");
        int numInput = input.nextInt();

        for (int i = 2; i <= numInput; i += 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}

/*
1.modification to Do make the program produce similar result but WITHOUT IF statement. 
Please insert a screenshot of your code to the report
Done
2.Do modification to make the program print like this following result. Please insert a screenshot of your code to the report
Done
*/