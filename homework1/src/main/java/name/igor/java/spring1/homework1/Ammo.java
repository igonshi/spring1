package name.igor.java.spring1.homework1;

public interface Ammo {
    float getCaliber();
    int getCapacity();
    void setCapacity(int capacity);
    default boolean fire() {
            if (this.getCapacity() == 0) return false;
            this.setCapacity(this.getCapacity()-1);
            return true;
    }
}
