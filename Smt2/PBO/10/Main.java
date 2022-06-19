import java.util.Scanner;

public class Main {

    // Add Name
    private static String nama;

    // Add scanner
    static final Scanner sc = new Scanner(System.in);

    // Add instance
    static Healer healer = new Healer(10,10,70);

    static Warrior warrior = new Warrior(30,25,80);

    static Titan titan = new Titan(0,45,200);
    
    static Magician magician = new Magician(10,60,100);

    public static void main(String[] args) {

        // Proses eksekusi
        run();
        // finish

    }

    public static void run(){
        String bTurn    = "========== TURN ";
        String tTurn    = "==========";
        String player   = "========== PLAYER ==========";
        String musuh    = "========== MUSUH ===========";
        String menang   = getNama()+" Menang\n";
        String kalah    = getNama()+" Kalah, (Game Over)\n";
        int data = 0;
        String chara;
        System.out.println("Selamat datang di game UB MMORPG !");
        System.out.print("Silahkan masukkan nama player -> ");
        nama = sc.nextLine();
        
        while (true) {
            System.out.println("Silahkan pilih karakter yang anda inginkan  : ");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            System.out.print("Memilih karakter -> ");
            chara = sc.next();
            try {
                data = Integer.parseInt(chara);
                break;
            } catch (NumberFormatException ne) {
                System.err.println("Harus Nomor yahh, kamu salah masukin inputannya :D\n");
            }
        }

        int turn = 1;
        System.out.println("Selamat datang, "+nama);
        switch (data) {
            case 1: magician.info();
                while (true){
                    System.out.println(bTurn+turn+tTurn);
                    if (magician.attack()){
                        titan.setHP(titan.getHP()-magician.getAttack());
                    }
                    if (magician.getHP() <= 0){
                        magician.setHP(0);
                        showHP(titan.getHP(), magician.getHP());
                        break;
                    } else if (titan.getHP() <= 0){
                        titan.setHP(0);
                        showHP(titan.getHP(), magician.getHP());
                        break;
                    } else {
                        showHP(titan.getHP(), magician.getHP());
                    }
                turn++;
                    System.out.println(bTurn+turn+tTurn);
                    if (titan.attack()){
                        magician.setHP(magician.getHP()-(titan.getAttack()-magician.getDefense()));
                    }
                    if (magician.getHP() <= 0){
                        magician.setHP(0);
                        showHP(titan.getHP(), magician.getHP());
                        break;
                    } else if (titan.getHP() <= 0){
                        titan.setHP(0);
                        showHP(titan.getHP(), magician.getHP());
                        break;
                    } else {
                        showHP(titan.getHP(), magician.getHP());
                    }
                turn++;
                }
                if (magician.getHP() > titan.getHP()){
                    System.out.println(menang);
                    System.out.println(player);
                    magician.info();
                    System.out.print("\n");
                    System.out.println(musuh);
                    titan.info();
                } else {
                    System.err.println(kalah);
                    System.out.println(player);
                    magician.info();
                    System.out.print("\n");
                    System.out.println(musuh);
                    titan.info();
                }
            break;

            case 2: healer.info();
                do {
                    System.out.println(bTurn+turn+tTurn);
                    // hero attack first
                    if (healer.attack()){
                        titan.setHP(titan.getHP()-healer.getAttack());
                    }

                    if (healer.getHP() <= 0){
                        healer.setHP(0);
                        showHP(titan.getHP(), healer.getHP());
                        break;
                    } else if (titan.getHP() <= 0){
                        titan.setHP(0);
                        showHP(titan.getHP(), healer.getHP());
                        break;
                    } else {
                        // heal mechanism
                        if (turn % 2 == 0){ // when heal enemy can't attack
                            healer.heal();
                        } else if (titan.attack()) { // titan attack
                            healer.setHP(healer.getHP()-(titan.getAttack()-healer.getDefense()));
                        }
                        showHP(titan.getHP(), healer.getHP());
                        turn++;
                    }
                    
                } while (true);
                if (healer.getHP() > titan.getHP()){
                    System.out.println(menang);
                    System.out.println(player);
                    healer.info();
                    System.out.print("\n");
                    System.out.println(musuh);
                    titan.info();
                } else {
                    System.err.println(kalah);
                    System.out.println(player);
                    healer.info();
                    System.out.print("\n");
                    System.out.println(musuh);
                    titan.info();
                }
            break;
                
            case 3: warrior.info();
                while (true){
                    System.out.println(bTurn+turn+tTurn);
                    if (warrior.attack()){
                        titan.setHP(titan.getHP()-warrior.getAttack());
                    }
                    if (warrior.getHP() <= 0){
                        warrior.setHP(0);
                        showHP(titan.getHP(), warrior.getHP());
                        break;
                    } else if (titan.getHP() <= 0){
                        titan.setHP(0);
                        showHP(titan.getHP(), warrior.getHP());
                        break;
                    } else {
                        showHP(titan.getHP(), warrior.getHP());
                    }
                turn++;
                    System.out.println(bTurn+turn+tTurn);
                    if (titan.attack()){
                        warrior.setHP(warrior.getHP()-(titan.getAttack()-warrior.getDefense()));
                    }
                    if (warrior.getHP() <= 0){
                        warrior.setHP(0);
                        showHP(titan.getHP(), warrior.getHP());
                        break;
                    } else if (titan.getHP() <= 0){
                        titan.setHP(0);
                        showHP(titan.getHP(), warrior.getHP());
                        break;
                    } else {
                        showHP(titan.getHP(), warrior.getHP());
                    }
                turn++;
                }
                if (warrior.getHP() > titan.getHP()){
                    System.out.println(menang);
                    System.out.println(player);
                    warrior.info();
                    System.out.print("\n");
                    System.out.println(musuh);
                    titan.info();
                } else {
                    System.err.println(kalah);
                    System.out.println(player);
                    warrior.info();
                    System.out.print("\n");
                    System.out.println(musuh);
                    titan.info();
                }
            break;
            default: System.err.println("Tidak ada role pada nomor ini, (Game Over)"); sc.close(); System.exit(0);
        }
        sc.close();
    }

    public static void showHP(int enemy, int hero){
        System.out.println("Enemy's HP  : "+enemy);
        System.out.println(getNama()+"'s HP  : "+hero);
    }

    public static String getNama(){
        return nama;
    }

}
