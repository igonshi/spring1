package name.igor.java.spring1.homework1;

public class Ammo762 implements Ammo {

    private float caliber=7.62f;
    private int capacity=8;

    public float getCaliber() {
        return this.caliber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return super.toString()+"(bullets="+this.capacity+")";
    }

}
