import java.io.*;
import java.util.*;

public class saldoNasabah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = sc.nextInt(), setoran = sc.nextInt();
        double admin = 7000.0, sisa;
        
        sisa = ((saldo + setoran - admin)+(saldo + setoran - admin)*5/10000);
        System.out.println(sisa);
        
    }
}
