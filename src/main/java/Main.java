/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        String name;
        // call the compute() method on that new object
        compute();
    }

    public static void compute() {
        // Get input string of name from user
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = in.nextLine();

        // Create conditional to check name against Alice and Bob
        if(name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hello, " + name + "!");
            // Print greeting to screen if Alice or Bob are true
        } else {
            System.out.println("You are neither Alice nor Bob.");
        }
        // Print "You are neither Alice nor Bob." otherwise
    }
}
