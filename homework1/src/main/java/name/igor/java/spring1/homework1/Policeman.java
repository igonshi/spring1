package name.igor.java.spring1.homework1;

public class Policeman implements Shooter {

    private Gun gun;
    private Ammo ammo;

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void setCartridge(Ammo ammo) {
        this.ammo = ammo;
    }

    public String fire() {
        if (!gun.load(ammo)) return "Incompatible "+ ammo +" for "+gun;
        if (!gun.fire()) return "Could't shoot with "+gun+" and "+ ammo;
        else return "Bang!!!";
    }
}
