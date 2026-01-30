//cp PrintSquares.java SumSquares.java //supposed to import PrintSquares to here?
//Open this file in the editor, and edit the function name to SumSquares. - ??? huh?
import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class SumSqaures { //copied instead from PrintSquares
    public static void main(String[] args) {
        int total = 0;
        // Declare Scanner object
        Scanner in = new Scanner(System.in); //works more like python inputs now :D

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Sequence of squares from " + startNum + " to " + endNum + ":");
        for (int i = startNum; i < (endNum+1); ++i) {
            total = total + (i*i);
        }
        System.out.print(total);
    }
}