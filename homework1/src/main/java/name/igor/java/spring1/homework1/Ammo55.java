package name.igor.java.spring1.homework1;

public class Ammo55 implements Ammo {

    private float caliber=5.5f;
    private int capacity=12;

    public float getCaliber() {
        return caliber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString()+"(bullets="+this.capacity+")";
    }

}
