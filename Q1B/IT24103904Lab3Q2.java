import java.util.Scanner;
 
public class IT24103904Lab3Q2 
{

         public static void main(String[]args)
         {

                                   //Declare and initialise the variables
                                    double discount,pricePerKg,quantity,amount,totalAmount ;

                      //Create a Scanner object to read input
                      Scanner input = new Scanner(System.in);

                      //Promt the user to enter the price per kilogram of rice
                      System.out.print("Enter the price of 1kg of rice: ");
                      pricePerKg = input.nextDouble();

                      //Promt the user to enter the kilograms that they want to buy
                      System.out.print("Enter the number of kilograms you want to buy: ");
                      quantity = input.nextDouble();

                      //Calculate the total amount to be paid
                      amount = pricePerKg * quantity;

                                  
                                   //Calculate the discount (10% of the total amount)
                                   discount = amount * 0.1;

                                   //Calculate the amount to pay after discount
                                   totalAmount = amount - discount;

//Display the total amount
        System.out.println("The total amount with 10% discount is: " +totalAmount);
         }
}

                 