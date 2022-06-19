import java.util.concurrent.ThreadLocalRandom;

public class Titan extends Character{

    // void method
    public Titan(){

    }

    public Titan(int defense, int attack, int HP){
        super(defense, attack, HP);
    }

    public boolean attack(){
        boolean sukses = false;
        int rdm = ThreadLocalRandom.current().nextInt(0,100);
            if (rdm <= 40){
                sukses = true;
            } else {
                sukses = false;
            }
        return sukses;
    }

    @Override
    void info() {
        System.out.println("----------STATUS----------");
        System.out.println("Role    : Titan");
        System.out.println("HP      : "+getHP());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}