public class Mahasiswa extends Manusia {

    private String NIM;
    private double IPK;

    public Mahasiswa(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK){
        super(nama, NIK, jenisKelamin, menikah);
            this.NIM = NIM;
            this.IPK = IPK;
    }

    public String getNIM(){
        return this.NIM;
    }

    public double getIPK(){
        return this.IPK;
    }

    public String getStatus(){
        String angkatan = "20"+getNIM().substring(0, 2);
        String prodi    = Character.toString(getNIM().charAt(6));
        if (Integer.parseInt(prodi) == 2){
            prodi = "Teknik Meniup Gelembung";
        } else if (Integer.parseInt(prodi) == 3){
            prodi = "Teknik Berburu Ubur Ubur";
        } else if (Integer.parseInt(prodi) == 4){
            prodi = "Sistem Perhamburgeran";
        } else if (Integer.parseInt(prodi) == 6){
            prodi = "Pendidikan Chum Bucket";
        } else if (Integer.parseInt(prodi) == 7){
            prodi = "Teknologi Telepon Kerang";
        } else {
            prodi = "Sastra Budaya Bikini Bottom";
        }
        
        return prodi+", "+angkatan;
    }

    public double getBeasiswa(){
        double duid = 0;
        if (getIPK() >= 3.0 && getIPK() < 3.5){
            duid = 50.0;
        } else if (getIPK() >= 3.5 && getIPK() < 4.0){
            duid = 75.0;
        }
        return duid;
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
        pendapatan = getPendapatan()+getBeasiswa();
        return
        "NAMA           : "+getNama()+"\n"+
        "NIK            : "+getNIK()+"\n"+
        "Jenis Kelamin  : "+kelamin+"\n"+
        "Pendapatan     : "+pendapatan+"$"+"\n"+
        "IPK            : "+getIPK()+"\n"+
        "NIM            : "+getNIM()+"\n"+
        "Status         : "+getStatus()+"\n"+
        "=======================================================";
    }

}
