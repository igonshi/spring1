package name.igor.java.spring1.homework1;

public class MainClass {

    public static void main(String[] args) {
        Shooter shooter = new Policeman();
        shooter.setGun(new PistolTT());
        shooter.setCartridge(new Ammo762());
        System.out.println(shooter.fire());
    }

}
