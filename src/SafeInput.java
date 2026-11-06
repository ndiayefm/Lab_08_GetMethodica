import java.util.Scanner;



public class SafeInput {



    public static String getNonZeroLenString(Scanner pipe, String prompt) {

        String retString = "";

        do {

            System.out.print("\n" + prompt + ": ");

            retString = pipe.nextLine();

        } while(retString.length() == 0);

        return retString;

    }



    public static int getInt(Scanner pipe, String prompt) {

        int retInt = 0;

        boolean isValid = false;

        do {

            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {

                retInt = pipe.nextInt();

                isValid = true;

            } else {

                String trash = pipe.next();

                System.out.println("Invalid input: \"" + trash + "\" is not an integer.");

            }

            pipe.nextLine();

        } while (!isValid);

        return retInt;

    }



    public static double getDouble(Scanner pipe, String prompt) {

        double retDouble = 0.0;

        boolean isValid = false;

        do {

            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {

                retDouble = pipe.nextDouble();

                isValid = true;

            } else {

                String trash = pipe.next();

                System.out.println("Invalid input: \"" + trash + "\" is not a double.");

            }

            pipe.nextLine();

        } while (!isValid);

        return retDouble;

    }



    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {

        int retInt = 0;

        boolean isValid = false;

        do {

            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {

                retInt = pipe.nextInt();

                if (retInt >= low && retInt <= high) {

                    isValid = true;

                } else {

                    System.out.println("Input out of range [" + low + " - " + high + "]: " + retInt);

                }

            } else {

                String trash = pipe.next();

                System.out.println("Invalid input: \"" + trash + "\" is not an integer.");

            }

            pipe.nextLine();

        } while (!isValid);

        return retInt;

    }



    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {

        double retDouble = 0.0;

        boolean isValid = false;

        do {

            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {

                retDouble = pipe.nextDouble();

                if (retDouble >= low && retDouble <= high) {

                    isValid = true;

                } else {

                    System.out.println("Input out of range [" + low + " - " + high + "]: " + retDouble);

                }

            } else {

                String trash = pipe.next();

                System.out.println("Invalid input: \"" + trash + "\" is not a double.");

            }

            pipe.nextLine();

        } while (!isValid);

        return retDouble;

    }



    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        boolean isValid = false;

        boolean retBool = false;

        do {

            System.out.print("\n" + prompt + " [Y/N]: ");

            String response = pipe.nextLine();

            if (response.equalsIgnoreCase("Y")) {

                retBool = true;

                isValid = true;

            } else if (response.equalsIgnoreCase("N")) {

                retBool = false;

                isValid = true;

            } else {

                System.out.println("Invalid input. Please enter 'Y' or 'N'.");

            }

        } while (!isValid);

        return retBool;

    }



    public static String getRegExString(Scanner pipe, String prompt, String regEx) {

        String retString = "";

        boolean isValid = false;

        do {

            System.out.print("\n" + prompt + ": ");

            retString = pipe.nextLine();

            if (retString.matches(regEx)) {

                isValid = true;

            } else {

                System.out.println("Input does not match required format patterns.");

            }

        } while (!isValid);

        return retString;

    }



    public static void prettyHeader(String msg) {

        int totalWidth = 60;

        for (int i = 0; i < totalWidth; i++) {

            System.out.print("*");

        }

        System.out.println();



        System.out.print("***");

        int spacesAvailable = totalWidth - 6;

        int totalSpacesToInsert = spacesAvailable - msg.length();

        int leftSpaces = totalSpacesToInsert / 2;

        int rightSpaces = totalSpacesToInsert - leftSpaces;



        for (int i = 0; i < leftSpaces; i++) {

            System.out.print(" ");

        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++) {

            System.out.print(" ");

        }

        System.out.println("***");



        for (int i = 0; i < totalWidth; i++) {

            System.out.print("*");

        }

        System.out.println();

    }

}