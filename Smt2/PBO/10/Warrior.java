import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Character {

    // void method
    public Warrior(){

    }

    public Warrior(int defense, int attack, int HP){
        super(defense, attack, HP);
    }

    public boolean attack(){
        boolean sukses = false;
        int rdm = ThreadLocalRandom.current().nextInt(0,100);
            if (rdm <= 60){
                sukses = true;
            } else {
                sukses = false;
            }
        return sukses;
    }

    @Override
    void info() {
        System.out.println("----------STATUS----------");
        System.out.println("Role    : Warrior");
        System.out.println("HP      : "+getHP());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}
