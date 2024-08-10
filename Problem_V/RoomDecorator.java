package Problem_V;

public abstract class RoomDecorator implements Room {
    private Room decoratedRoom;
    RoomDecorator(Room decoratedRoom) {
        this.decoratedRoom = decoratedRoom;
    }

    @Override
    public String descriptionRoom() {
        return decoratedRoom.descriptionRoom();
    }

    @Override
    public int cost() {
        return decoratedRoom.cost();
    }
}
