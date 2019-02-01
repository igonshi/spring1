package name.igor.java.spring1.homework1;

public interface Gun {
    boolean load(Ammo ammo);
    boolean isArmed();
    float getCaliber();
    boolean fire();
}
