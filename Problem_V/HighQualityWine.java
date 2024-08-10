package Problem_V;

public class HighQualityWine extends RoomDecorator{
    HighQualityWine(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public String descriptionRoom() {
        return super.descriptionRoom()+", High Quality Wine";
    }

    @Override
    public int cost() {
        return super.cost() + 35;
    }
}
