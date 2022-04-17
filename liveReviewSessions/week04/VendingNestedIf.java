package week04;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coke";
        String snackItem = "crisp";
        if (selection == "drink") {
            System.out.println("Drink option is selected");
            if (drinkItem == "tea"){
                System.out.println("Tea is selected");
            }
            else if (drinkItem == "coke") {
                System.out.println("Coke is selected");
            }
        }
        else if (selection == "snack") {
            if (snackItem == "chips"){
                System.out.println("Chips is selected");
            }
            else if (snackItem == "candy") {
                System.out.println("Candy is selected");
            }
        }
        else {
            System.out.println("Invalid option");
        }

    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
========================================
 */