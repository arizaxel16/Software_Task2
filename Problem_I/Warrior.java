package Problem_I;

public class Warrior implements HeroPrototype {
    private String name;
    private String appearance;
    private int level;
    private int upgradePoints;
    private int xp;
    private final String ATTACK = "Sword Attack";
    private final String DEFENSE = "Shield Block";
    private final String ABILITY = "War Chant";

    public Warrior(String name, String appearance, int level, int upgradePoints, int xp) {
        this.name = name;
        this.appearance = appearance;
        this.level = level;
        this.upgradePoints = upgradePoints;
        this.xp = xp;
    }

    public Warrior(Warrior target) {
        if (target != null) {
            this.name = target.name;
            this.appearance = target.appearance;
            this.level = target.level;
            this.upgradePoints = target.upgradePoints;
            this.xp = target.xp;
        }
    }

    @Override
    public Warrior clone() {
        return new Warrior(this);
    }

    @Override
    public String heroInfo() {
        return "\nHero Info" +
                "\nType: Warrior" +
                "\nName: " + this.name +
                "\nAppearance: " + this.appearance +
                "\nLevel: " + this.level +
                "\nXP: " + this.xp;
    }

    @Override
    public void lvlUp() {
        level++;
    }

    // Getters / Setters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAppearance() {
        return appearance;
    }

    @Override
    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getUpgradePoints() {
        return upgradePoints;
    }

    @Override
    public void setUpgradePoints(int upgradePoints) {
        this.upgradePoints = upgradePoints;
    }

    @Override
    public int getXp() {
        return xp;
    }

    @Override
    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String getAttack() {
        return ATTACK;
    }

    @Override
    public String getDefense() {
        return DEFENSE;
    }

    @Override
    public String getAbility() {
        return ABILITY;
    }
}
