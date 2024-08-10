package Problem_V;

public class Refrigerator extends RoomDecorator{
    Refrigerator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public String descriptionRoom() {
        return super.descriptionRoom() + ", Refrigerator";
    }

    @Override
    public int cost() {
        return super.cost() + 35;
    }
}
