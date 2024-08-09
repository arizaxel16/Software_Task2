package Problem_III;

public class BeverageOrder extends OrderProcessor{
    @Override
    void preparingOrder() {
        System.out.println("Preparing Beverage Order");
    }

    @Override
    void calculatingPrice() {
        System.out.println("Calculating Price for Beverage Order");
    }

    @Override
    void completingOrder() {
        System.out.println("Completing Beverage Order");
    }
}
