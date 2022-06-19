public class Pekerja extends Manusia {
    private double  gaji;
    private double  bonus;
    private int     jamKerja; //sama setiap harinya dalam satuan jam
    private int     hariKerja; //tetap bekerja dan dimulai hari senin
    private String  NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah){
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja   = jamKerja;
        this.hariKerja  = hariKerja;
        this.NIP        = NIP;
    }

    public double getGaji(){
        int hari = 0;
        int jam = 0;
        if (getHariKerja() % 7 != 0){
            switch (getHariKerja() % 7){
                case 1: hari = 1 + getHariKerja() - getHariKerja() / 7; //hari senin
                break;
                case 2: hari = 2 + getHariKerja() - getHariKerja() / 7; //hari selasa
                break;
                case 3: hari = 3 + getHariKerja() - getHariKerja() / 7; //hari rabu
                break;
                case 4: hari = 4 + getHariKerja() - getHariKerja() / 7; //hari kamis
                break;
                case 5: hari = 5 + getHariKerja() - getHariKerja() / 7; //hari jumat
                break;
                case 6: hari = 6 + getHariKerja() - getHariKerja() / 7; //hari sabtu
                break;
                default: hari = 0; //cek kesalahan
                break;
            }
        } else {
            hari = getHariKerja() - getHariKerja() / 7;
        }

        if (getJamKerja() <= 7){
            jam = getJamKerja();
        } else {
            jam = 7;
        }
        this.gaji = hari * jam * 15;
        return this.gaji; // hari normal + jam normal
    }

    public double getBonus(){
        int hari = 0;
        int jam = 0;

        if (getHariKerja() % 7 != 0){
            switch (getHariKerja() % 7){
                case 1: hari = 1 + getHariKerja() - getHariKerja() / 7; //hari senin
                break;
                case 2: hari = 2 + getHariKerja() - getHariKerja() / 7; //hari selasa
                break;
                case 3: hari = 3 + getHariKerja() - getHariKerja() / 7; //hari rabu
                break;
                case 4: hari = 4 + getHariKerja() - getHariKerja() / 7; //hari kamis
                break;
                case 5: hari = 5 + getHariKerja() - getHariKerja() / 7; //hari jumat
                break;
                case 6: hari = 6 + getHariKerja() - getHariKerja() / 7; //hari sabtu
                break;
                default: hari = 0; //cek kesalahan
                break;
            }
        } else {
            hari = getHariKerja() - getHariKerja() / 7;
        }

        if (getJamKerja() > 7){
            jam = getJamKerja() - 7; //jam lembur
            this.bonus = hari * jam * 7;
            this.bonus += ((getHariKerja() - hari) * getJamKerja() * 20);
        } else {
            jam = getJamKerja();
            this.bonus = ((getHariKerja() - hari) * jam * 20);
        }
        return this.bonus;
    }

    public int getJamKerja(){
        return this.jamKerja;
    }

    public int getHariKerja(){
        return this.hariKerja;
    }

    public String getNIP(){
        return this.NIP;
    }

    public String getStatus(){
        String departemen, kantor, cabang;
        departemen = Character.toString(getNIP().charAt(6));
        kantor = Character.toString(getNIP().charAt(0));
        cabang = Character.toString(getNIP().charAt(2));

        switch (Integer.parseInt(departemen)) {
            case 1: departemen = "Pemasaran";
            break;
            case 2: departemen = "Humas";
            break;
            case 3: departemen = "Riset";
            break;
            case 4: departemen = "Teknologi";
            break;
            case 5: departemen = "Personalia";
            break;
            case 6: departemen = "Akademik";
            break;
            case 7: departemen = "Administrasi";
            break;
            case 8: departemen = "Operasional";
            break;
            case 9: departemen = "Pembangunan";
            break;
            default: departemen = "Pengangguran";
            break;
        }

        switch (Integer.parseInt(kantor)){
            case 1: kantor = "Mondstadt";
            break;
            case 2: kantor = "Liyue";
            break;
            case 3: kantor = "Inazuma";
            break;
            case 4: kantor = "Sumeru";
            break;
            case 5: kantor = "Fontaine";
            break;
            case 6: kantor = "Natlan";
            break;
            case 7: kantor = "Snezhnaya";
            break;
            default: kantor = "ISEKAI";
        }

        return departemen+", "+kantor+" cabang ke-"+cabang;
    }

    @Override
    public String toString(){
        double pendapatan = 0;
        String kelamin;
        if (getJenisKelamin()){
            kelamin = "Laki-Laki";
        } else {
            kelamin = "Perempuan";
        }
        pendapatan = getPendapatan()+getBonus()+getGaji();
        return
        "NAMA           : "+getNama()+"\n"+
        "NIK            : "+getNIK()+"\n"+
        "NIP            : "+getNIP()+"\n"+
        "Jenis Kelamin  : "+kelamin+"\n"+
        "Pendapatan     : "+pendapatan+"$"+"\n"+
        "Bonus          : "+getBonus()+"$"+"\n"+
        "Gaji           : "+getGaji()+"$"+"\n"+
        "Status         : "+getStatus()+"\n"+
        "=======================================================";
    }

}
