import java.util.Scanner;



public class FavNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        // This automatically pulls your Part B method

        int favInt = SafeInput.getInt(in, "Enter your favorite integer");



        // This automatically pulls your Part C method

        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");



        System.out.println("\nYour favorite integer is: " + favInt);

        System.out.println("Your favorite double is: " + favDouble);

    }

}