package encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

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
