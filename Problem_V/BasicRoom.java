package Problem_V;

public class BasicRoom implements Room {
    @Override
    public String descriptionRoom() {
        return "Room: Bathroom, Bed";
    }

    @Override
    public int cost() {
        return 250;
    }
}
