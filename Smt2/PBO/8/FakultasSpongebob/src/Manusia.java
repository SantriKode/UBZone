public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    /*
        Bagi yang telah menikah (laki laki 25$) (Perempuan 20$)
        Bagi yang belum menikah tunjangan 15$
    */

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama           = nama;
        this.NIK            = NIK;
        this.jenisKelamin   = jenisKelamin;
        this.menikah        = menikah;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNIK(){
        return this.NIK;
    }

    public boolean getJenisKelamin(){
        return this.jenisKelamin;
    }

    public boolean getMenikah(){
        return this.menikah;
    }

    public double getTunjangan(){
        double duid;
        if (getMenikah()){
            if (getJenisKelamin()){ 
                duid = 25.0; //pria
            } else {
                duid = 20.0; //wanita
            }
        } else {
            duid = 15.0; //lomnikah
        }
        return duid;
    }

    public double getPendapatan(){
        double duidTotal = 0;
        duidTotal += getTunjangan();
        return duidTotal;
    }

    public String toString(){
        String kelamin;
        if (getJenisKelamin()){
            kelamin = "Laki-Laki";
        } else {
            kelamin = "Perempuan";
        }
        return
        "NAMA           : "+getNama()+"\n"+
        "NIK            : "+getNIK()+"\n"+
        "Jenis Kelamin  : "+kelamin+"\n"+
        "Pendapatan     : "+getPendapatan()+"$"+"\n"+
        "=======================================================";
    }
    
}
