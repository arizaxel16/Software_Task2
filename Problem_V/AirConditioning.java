package Problem_V;

public class AirConditioning extends RoomDecorator{
    AirConditioning(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public String descriptionRoom() {
        return super.descriptionRoom()+", Air Conditioning";
    }

    @Override
    public int cost() {
        return super.cost()+50;
    }
}
