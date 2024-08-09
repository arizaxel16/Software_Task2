package Problem_III;

public class FoodOrder extends OrderProcessor{
    @Override
    void preparingOrder() {
        System.out.println("Preparing Food Order");
    }

    @Override
    void calculatingPrice() {
        System.out.println("Calculating price for Food Order");
    }

    @Override
    void completingOrder() {
        System.out.println("Completing Food Order");
    }
}
