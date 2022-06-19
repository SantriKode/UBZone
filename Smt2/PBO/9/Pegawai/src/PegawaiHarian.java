public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama,noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam(){
        return this.upahPerJam;
    }

    public int getTotalJam(){
        return this.totalJam;
    }

    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }

    @Override
    public String toString(){
        String garis = "||=====================================================||";
        return 
            garis+"\n"+
            "   Pegawai Harian      : "+getNama()+"\n"+
            "   No. KTP             : "+getNoKTP()+"\n"+
            "   Upah per jam        : "+getUpahPerJam()+"\n"+
            "   Total jam kerja     : "+getTotalJam()+"\n"+
            "   Pendapatan          : Rp "+(int)gaji()+"\n"+
            garis
        ;
    }

    @Override
    public double gaji(){
        double totalGaji = 0;
        if (getTotalJam() <= 40){
            totalGaji += getUpahPerJam() * getTotalJam();
        } else {
            totalGaji += getUpahPerJam() * 40;
            totalGaji += getUpahPerJam() * (getTotalJam()-40) * 1.5;
        }
        return totalGaji;
    }
}
