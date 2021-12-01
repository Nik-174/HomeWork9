import weapon.*;

public class Player {

    private Weapon[] weaponSlots;
    private String[] weaponName;

    public Player() {

        weaponSlots = new Weapon[]{
                new Gun(),
                new AutomaticGun(),
                new GrenadeLauncher(),
                new Slingshot(),
                new WaterPistol()
        };
        weaponName = new String[]{"Пистолет",
                "Автомат",
                "РПГ",
                "Рогатка",
                "Водяной пистолет"};
    }


    public void paintWeapon() {
        for (int i = 0; i < weaponName.length; i++) {
            System.out.println((i + 1) + " " + weaponName[i]);
        }
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > this.getSlotsCount()) {
            System.out.println("слот должен быть от 0 до " + this.getSlotsCount() + " включительно");
        } else {
            Weapon weapon = weaponSlots[slot - 1];
            System.out.print(weaponName[slot - 1] + " стреляет: ");
            weapon.shot();

        }
    }
}


