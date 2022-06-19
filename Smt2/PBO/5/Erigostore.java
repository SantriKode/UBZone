import java.util.Scanner;

public class Erigostore {
    String type;
    int price;
    int sum;
    int prices;

    private final int clothA = 100000;
    private final int clothB = 125000;
    private final int clothC = 175000;

    void priceA(){
        if (this.sum > 100){
            this.price = 95000;
            this.prices = price*sum;
        } else {
            this.price = clothA;
            this.prices = price*sum;
        }
    }

    void priceB(){
        if (this.sum > 100){
            this.price = 120000;
            this.prices = price*sum;
        } else {
            this.price = clothB;
            this.prices = price*sum;
        }
    }

    void priceC(){
        if (this.sum > 100){
            this.price = 160000;
            this.prices = price*sum;
        } else {
            this.price = clothC;
            this.prices = price*sum;
        }
    }

    void display(String type){
        if (type.equalsIgnoreCase("a")){
            priceA();
        } else if (type.equalsIgnoreCase("b")){
            priceB();
        } else if (type.equalsIgnoreCase("c")){
            priceC();
        }

        System.out.println("Jenis yang anda beli  : "+type);
        System.out.println("Harga per buah        : "+price);
        System.out.println("Total harga           : "+prices);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Erigostore estore = new Erigostore();
        
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga "+estore.clothA);
        System.out.println("Baju B dengan harga "+estore.clothB);
        System.out.println("Baju C dengan harga "+estore.clothC);
        System.out.print("Baju yang akan anda beli bertipe : "); estore.type = sc.nextLine();
        System.out.print("");
        System.out.print("Jumlah baju yang akan anda beli adalah : "); estore.sum = sc.nextInt();
        System.out.println(""); sc.close();

        estore.display(estore.type);
        

    }
}
