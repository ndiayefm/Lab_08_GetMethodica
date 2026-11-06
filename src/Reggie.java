import java.util.Scanner;



public class Reggie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        String ssn = SafeInput.getRegExString(in, "Enter your SSN (Format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");

        String mNumber = SafeInput.getRegExString(in, "Enter your UC M-Number (Format: MXXXXX)", "^(M|m)\\d{5}$");

        String menuChoice = SafeInput.getRegExString(in, "Enter menu option (Open, Save, View, Quit)", "^[OoSsVvQq]$");



        System.out.println("\nValidated Inputs Summary:");

        System.out.println("SSN: " + ssn);

        System.out.println("M-Number: " + mNumber);

        System.out.println("Menu Option Selected: " + menuChoice.toUpperCase());

    }

}

