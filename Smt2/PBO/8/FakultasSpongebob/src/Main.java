import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException{
        Manusia[] man = new Manusia[5]; 
        Mahasiswa[] mhs = new Mahasiswa[5];
        Pekerja[] pkj = new Pekerja[5];
        Manajer[] mnj = new Manajer[5];

        System.out.println("=======================================================");
        man[0] = new Manusia("Simon Petrus", "0201234567", true, true);
        man[1] = new Manusia("Kagami Yuu", "0204321567", true, false);
        man[2] = new Manusia("Renaldi Aldo", "0208765567", false, true);
        man[3] = new Manusia("Alfeus", "0209876567", true, false);
        man[4] = new Manusia("Yudas Iskariot", "0209832567", false, false);
        
        mhs[0] = new Mahasiswa("You Utup", "2012345670", true, true, "125125260" , 3.9);
        mhs[1] = new Mahasiswa("Loy Hub", "2012345671", true, false, "145125360" , 3.6);
        mhs[2] = new Mahasiswa("Bat Putus", "2012345672", false, true, "165125460" , 3.0);
        mhs[3] = new Mahasiswa("Ken Putu", "2012345673", true, false, "185125660" , 3.3);
        mhs[4] = new Mahasiswa("Yen Sutup", "2012345674", false, false, "225125760" , 3.5);
        
        pkj[0] = new Pekerja(24, 30, "654567891", "Snipen Elves", "1269464602", true, true);
        pkj[1] = new Pekerja(12, 29, "545567891", "Aoi Lurd", "1269464603", true, false);
        pkj[2] = new Pekerja(18, 28, "423567891", "Lord Kazuma", "1269464604", true, false);
        pkj[3] = new Pekerja(16, 25, "312567891", "King Kazama", "1269464605", false, false);
        pkj[4] = new Pekerja(8, 31, "201567891", "Yu Ijin", "1269646602", true, false);

        mnj[0] = new Manajer(2, 30, "20012345", "King Solomon", "2015691011", true, true, 1000);
        mnj[1] = new Manajer(4, 14, "31112345", "King Salmanan", "2015691016", true, true, 1200);
        mnj[2] = new Manajer(16, 20, "42212345", "King Sovereign", "2015694011", true, true, 1400);
        mnj[3] = new Manajer(12, 14, "53312345", "King Archangel", "2015621011", true, true, 1600);
        mnj[4] = new Manajer(6, 28, "64412345", "King Kudus", "2015691015", true, true, 1800);

        display(man,mhs,pkj,mnj);
    }

    public static void display(Manusia[] man, Mahasiswa[] mhs, Pekerja[] pkj, Manajer[] mnj){
        int count = 0;
        for (int i = 0; i < 5; i++ ){
            System.out.println(man[i].toString());
            System.out.println(mhs[i].toString());
            System.out.println(pkj[i].toString());
            System.out.println(mnj[i].toString());
            count += 4;
        }
        System.out.println("Total Objek    : "+count);
        System.out.println("=======================================================");
    }

}
