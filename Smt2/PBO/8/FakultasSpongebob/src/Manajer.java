public class Manajer extends Pekerja {
    private int lamaKerja; // mengunakan satuan tahun

    /*
        Tunjangan + 15$
        Bonus + 30%
    */

    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja){
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja(){
        return this.lamaKerja;
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
        pendapatan = (getPendapatan()+15)+(getBonus()*(130/100))+getGaji();
        return
        "NAMA           : "+getNama()+"\n"+
        "NIK            : "+getNIK()+"\n"+
        "NIP            : "+getNIP()+"\n"+
        "Jenis Kelamin  : "+kelamin+"\n"+
        "Pendapatan     : "+pendapatan+"$"+"\n"+
        "Bonus          : "+getBonus()+"$"+"\n"+
        "Gaji           : "+getGaji()+"$"+"\n"+
        "Status         : "+getStatus()+"\n"+
        "Lama Kerja     : "+getLamaKerja()+"\n"+
        "=======================================================";
    }
}
