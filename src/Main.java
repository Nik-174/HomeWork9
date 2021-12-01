
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("У игрока " + player.getSlotsCount() + " слотов с оружием:");
        player.paintWeapon();
        System.out.format("введите номер от 1 до %d чтобы выстрелить,"
                        + "или -1 чтобы выйти%n",
                        player.getSlotsCount());

        int slot;

        while (true) {
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == (-1)) {
                break;
            } else {
                player.shotWithWeapon(slot);
            }
        }
        System.out.println("Game over!");
    }
}
