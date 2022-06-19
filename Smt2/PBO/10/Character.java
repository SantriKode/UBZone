abstract class Character {
    protected int defense;
    protected int attack;
    protected int HP;

    // void method
    protected Character(){

    }

    protected Character(int defense, int attack, int HP){
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    public int getDefense(){
        return this.defense;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getHP(){
        return this.HP;
    }

    public void setAttack(int ATK){
        this.attack = ATK;
    }

    public void setHP(int HP){
        this.HP = HP;
    }

    public void setDefense(int DEF){
        this.defense = DEF;
    }

    public abstract boolean attack();

    void receiveDamage(int Damage){
        if (Damage > 0){
            setHP(getHP() - Damage);
        } else {
            // no damage
        }
    }

    void info(){
        System.out.println("Tanpa info karakter");
    }

}
