import java.util.Scanner;



public class CheckOut {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double totalCost = 0.0;

        boolean hasMoreItems = true;



        System.out.println("Welcome to the $10 Store checkout system!");



        while (hasMoreItems) {

            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);

            totalCost += itemPrice;

            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to enter?");

        }



        System.out.printf("\nTotal cost of your item(s): $%.2f\n", totalCost);

    }

}