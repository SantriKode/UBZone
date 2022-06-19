import java.util.concurrent.ThreadLocalRandom;

public class Healer extends Character {

    // void method
    public Healer(){

    }

    public Healer(int defense, int attack, int HP){
        super(defense, attack, HP);
    }

    public boolean attack(){
        boolean sukses = false;
        int rdm = ThreadLocalRandom.current().nextInt(0,100);
            if (rdm <= 85){
                sukses = true;
            } else {
                sukses = false;
            }
        return sukses;
    }

    void heal(){
        System.out.println("Menggunakan skill heal !");
        setHP(getHP()+25);
    }

    @Override
    public int getHP(){
        return this.HP;
    }

    @Override
    public void setHP(int HP){
        this.HP = HP;
    }

    @Override
    public void info() {
        System.out.println("----------STATUS----------");
        System.out.println("Role    : Healer");
        System.out.println("HP      : "+getHP());
        System.out.println("Attack  : "+getAttack());
        System.out.println("Defense : "+getDefense());
    }
}
