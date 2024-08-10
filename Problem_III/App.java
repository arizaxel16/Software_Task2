package Problem_III;

public class App {
    public static void main(String[] args) {
        OrderProcessor foodOrder = new FoodOrder();
        OrderProcessor dessertOrder = new DessertOrder();
        OrderProcessor beverageOrder = new BeverageOrder();

        System.out.println("\nProcessing Food Order:");
        foodOrder.processOrder();

        System.out.println("\nProcessing Dessert Order:");
        dessertOrder.processOrder();

        System.out.println("\nProcessing Beverage Order:");
        beverageOrder.processOrder();
    }
}

