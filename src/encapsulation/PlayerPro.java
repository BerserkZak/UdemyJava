package encapsulation;

public class PlayerPro {

    private final String name;
    private int health;
    private final String weapon;

    public PlayerPro(String name) {
        this(name, 100, "AK-105");
    }

    public PlayerPro(String name, int health, String weapon) {
        this.name = name;
        if (health < 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){

        health = health - damage;
        if (health <= 0){
            System.out.println("You died!");
        }

    }

    public int healthRemaining(){

        return health;

    }

    public void restoreHealth(int extraHealth){

        health = health + extraHealth;
        if (health > 0){
            System.out.println("Health restored!");
            health = 100;
        }

    }



}
