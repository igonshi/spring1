package name.igor.java.spring1.homework1;

public class PistolTT implements Gun {
    private Ammo ammo;
    private float caliber=7.62f;

    public boolean load(Ammo ammo) {
        if (ammo.getCaliber()!=this.getCaliber()) return false;
        this.ammo = ammo;
        return true;
    }

    @Override
    public boolean isArmed() {
        return ammo!=null;
    }

    public float getCaliber() {
        return caliber;
    }

    public boolean fire() {
        if (this.ammo == null) return false;
        return this.ammo.fire();
    }

}
