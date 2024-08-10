package Problem_V;

public class FreshFlowers extends RoomDecorator{
    FreshFlowers(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public String descriptionRoom() {
        return super.descriptionRoom()+", Fresh Flowers";
    }

    @Override
    public int cost() {
        return super.cost() + 20;
    }
}
