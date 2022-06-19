import java.util.concurrent.ThreadLocalRandom;

public class Magician extends Character {
    
    // void method
    public Magician(){

    }

    public Magician(int defense, int attack, int HP){
        super(defense, attack, HP);
    }

    public boolean attack(){
        boolean sukses = false;
        int rdm = ThreadLocalRandom.current().nextInt(0,100);
            if (rdm <= 35){
                sukses = true;
            } else {
                sukses = false;
            }
        return sukses;
    }

    @Override
    void info() {
        System.out.println("----------STATUS----------");
        System.out.println("Role    : Magician");
        System.out.println("HP      : "+getHP());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}
