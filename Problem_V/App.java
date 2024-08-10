package Problem_V;

public class App {
    public static void main(String[] args) {
        Room room = new BasicRoom();
        System.out.println(room.descriptionRoom() + " Cost: $" + room.cost());

        room = new FreshFlowers(room);
        System.out.println(room.descriptionRoom() + " Cost: $" + room.cost());

        room = new HighQualityWine(room);
        System.out.println(room.descriptionRoom() + " Cost: $" + room.cost());

        room = new GourmetChocolate(room);
        System.out.println(room.descriptionRoom() + " Cost: $" + room.cost());

        room = new AirConditioning(room);
        System.out.println(room.descriptionRoom() + " Cost: $" + room.cost());

        room = new Refrigerator(room);
        System.out.println(room.descriptionRoom() + " Cost: $" + room.cost());
    }
}
