package Problem_III;

public class DessertOrder extends OrderProcessor{
    @Override
    void preparingOrder() {
        System.out.println("Preparing Dessert Order");
    }

    @Override
    void calculatingPrice() {
        System.out.println("Calculating price for Dessert Order");
    }

    @Override
    void completingOrder() {
        System.out.println("Completing Dessert Order");
    }
}
