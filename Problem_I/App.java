package Problem_I;

public class App {
    public static void main(String[] args) {
        HeroPrototype player_1 = new Mage("Hades", "God of Death", 99, 10, 10000);
        System.out.println(player_1.heroInfo());

        player_1.lvlUp();
        System.out.println(player_1.heroInfo());


        HeroPrototype clone_1 = player_1.clone();
        System.out.println(clone_1.heroInfo());

        clone_1.setName("Zeus");
        clone_1.setAppearance("God of Thunder");

        clone_1.lvlUp();
        System.out.println(clone_1.heroInfo());
    }
}
