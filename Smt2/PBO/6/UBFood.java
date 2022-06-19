import java.io.IOException;
import java.util.Scanner;

/*
    NAMA    : AHMAD NAUVAL SYAHPUTRA
    NIM     : 215150601111021
    PRODI   : PTI-C

*/

public class UBFood {

    public static class Merchant{
        private String namaMerchant, namaProduk;
        private double hargaMakanan;

        public Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
            setHargaMakanan(hargaMakanan);
            setNamaMerchant(namaMerchant);
            setNamaProduk(namaProduk);
        }
        public String getNamaMerchant(){
            return this.namaMerchant;
        }
        public void setNamaMerchant(String namaMerchant){
            this.namaMerchant = namaMerchant;
        }
        public String getNamaProduk(){
            return this.namaProduk;
        }
        public void setNamaProduk(String namaProduk){
            this.namaProduk = namaProduk;
        }
        public double getHargaMakanan(){
            return this.hargaMakanan;
        }
        public void setHargaMakanan(double hargaMakanan){
            this.hargaMakanan = hargaMakanan;
        }
    }

    public class DataMerchant{
        static Scanner sc = new Scanner(System.in);
        static Merchant merc[] = new Merchant[3];
        
        public static Merchant[] tambahMerchant(Merchant merchant){
            int count = 0;
            do {
                if (merc[count] == null){
                    merc[count]=merchant; break;
                } else {
                    count++;
                }
            } while (count < merc.length);
            return merc;
        }

        public static void tampilData(){ //mahasiswa
            for (Merchant mch1 : merc ){
                System.out.println("====Tampilan Data Merchant UBFood====");
                System.out.println("Nama Merchant   : "+mch1.getNamaMerchant());
                System.out.println("Nama Produk     : "+mch1.getNamaProduk());
                System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
            }
        }

        public static Merchant cariMerchant(String nama){
            int count = 0;
            do {
                if (merc[count].getNamaMerchant().equals(nama)){
                    break;
                } else {
                    count++;
                }
            } while (count < merc.length);
            return merc[count];
        }
        public static void tampilMerchant(Merchant merchant){
            merchant.getNamaMerchant();
        }
        public static void updateMerchant(Merchant merchant){ //mahasiswa
            merchant.setNamaMerchant(sc.nextLine());
            merchant.setNamaProduk(sc.nextLine());
            merchant.setHargaMakanan(sc.nextDouble());
            sc.close();
        }

        
    }
    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Pentol Bakso", 80000.0));
            DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000.0));
            DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000.0));
            //DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(sc.nextLine(), sc.nextLine(), sc.nextDouble())); sc.nextLine();
            //DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(sc.nextLine(), sc.nextLine(), sc.nextDouble())); sc.nextLine();
            DataMerchant.tampilData();
            sc.close();
        }
    }

}
