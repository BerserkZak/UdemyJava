package encapsulation;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "BerserkZak";
        player.health = 100;
        player.weapon = "AK-105";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

    }

}
