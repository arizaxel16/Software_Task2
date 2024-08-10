package Problem_V;

public class GourmetChocolate extends RoomDecorator{
    GourmetChocolate(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public String descriptionRoom() {
        return super.descriptionRoom() + ", Gourmet Chocolate";
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
