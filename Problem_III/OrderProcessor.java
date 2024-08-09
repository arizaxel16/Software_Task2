package Problem_III;

public abstract class OrderProcessor {
    public OrderProcessor() {
    }

    public void processOrder() {
        this.takingOrder();
        this.checkingAvailability();
        this.preparingOrder();
        this.calculatingPrice();
        this.completingOrder();
    }

    void takingOrder() {
        System.out.println("Taking Order");
    }

    void checkingAvailability() {
        System.out.println("Checking Availability");
    }

    abstract void preparingOrder();

    abstract void calculatingPrice();

    abstract void completingOrder();
}
