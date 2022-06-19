import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException{
        Pegawai[] pgh = new PegawaiHarian[4];
        pgh[0] = new PegawaiHarian("Sumi Shanta", "3507146789020002", 50000, 40);
        pgh[1] = new PegawaiHarian("Yuni Thahar", "3507144989020002", 50000, 35);
        pgh[2] = new PegawaiHarian("Cebol Wazausky", "3507146099020002", 50000, 50);
        pgh[3] = new PegawaiHarian("Kromatine Elf", "3507146700020002", 50000, 49);
        Pegawai[] pgt = new PegawaiTetap[4];
        pgt[0] = new PegawaiTetap("Funni Chebvoltsky", "3507155563020001", 2700000);
        pgt[1] = new PegawaiTetap("Futon Kaokuni", "3507144504320001", 2600000);
        pgt[2] = new PegawaiTetap("Fashad Ali", "3507144561110001", 2800000);
        pgt[3] = new PegawaiTetap("Firman Alyaqin", "3507123263020001", 2900000);
        Pegawai[] sls = new Sales[4];
        sls[0] = new Sales("Ayaka Shenlong", "3507142342020001", 500000, 20);
        sls[1] = new Sales("Cyka Blyess", "3507152358020002", 410000, 22);
        sls[2] = new Sales("Putang Inanezumi", "3507145845020004", 600000, 19);
        sls[3] = new Sales("Godverdammne van Rodrigues", "3507142458020001", 390000, 21);
        
        for (int i = 0; i < 4; i++){
            System.out.println(
                pgh[i].toString()+"\n"+
                pgt[i].toString()+"\n"+
                sls[i].toString()+"\n"
                );
        }
    }
}
