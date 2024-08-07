package Problem_I;

public interface HeroPrototype {
    HeroPrototype clone();
    String heroInfo();

    String getName();
    void setName(String name);
    
    String getAppearance();
    void setAppearance(String appearance);
    
    int getLevel();
    void lvlUp();

    int getUpgradePoints();
    void setUpgradePoints(int upgradePoints);
    
    int getXp();
    void setXp(int xp);

    String getAttack();
    String getDefense();
    String getAbility();
}
