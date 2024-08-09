package Problem_III;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type of order: 1.Food 2.Beverage 3.Dessert (write only the number): ");
        int type = scanner.nextInt();
        if (type == 1) {
            OrderProcessor food = new FoodOrder();
            food.processOrder();
        } else if (type == 2) {
            OrderProcessor beverage = new BeverageOrder();
            beverage.processOrder();
        } else if (type == 3) {
            OrderProcessor dessert = new DessertOrder();
            dessert.processOrder();
        }

    }
}
