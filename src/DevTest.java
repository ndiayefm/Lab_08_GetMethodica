import java.util.Scanner;



public class DevTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        System.out.println("=== Testing Part A: getNonZeroLenString ===");

        String stringTest = SafeInput.getNonZeroLenString(in, "Enter a non-blank string");

        System.out.println("Part A Result: " + stringTest);



        System.out.println("\n=== Testing Part B: getInt ===");

        int intTest = SafeInput.getInt(in, "Enter any integer (Try entering text first!)");

        System.out.println("Part B Result: " + intTest);



        System.out.println("\n=== Testing Part C: getDouble ===");

        double doubleTest = SafeInput.getDouble(in, "Enter any double value");

        System.out.println("Part C Result: " + doubleTest);



        System.out.println("\n=== Testing Part D: getRangedInt ===");

        int rangedIntTest = SafeInput.getRangedInt(in, "Enter an integer between 10 and 20", 10, 20);

        System.out.println("Part D Result: " + rangedIntTest);



        System.out.println("\n=== Testing Part E: getRangedDouble ===");

        double rangedDoubleTest = SafeInput.getRangedDouble(in, "Enter a double between 0.5 and 5.5", 0.5, 5.5);

        System.out.println("Part E Result: " + rangedDoubleTest);



        System.out.println("\n=== Testing Part F: getYNConfirm ===");

        boolean ynTest = SafeInput.getYNConfirm(in, "Do you want to continue?");

        System.out.println("Part F Result: " + ynTest);



        System.out.println("\n=== Testing Part G: getRegExString ===");

        String regexTest = SafeInput.getRegExString(in, "Enter a single lowercase letter", "^[a-z]$");

        System.out.println("Part G Result: " + regexTest);



        System.out.println("\nAll scratch tests complete!");

    }

}