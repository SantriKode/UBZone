public class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNoKTP(){
        return this.noKTP;
    }

    public String toString(){
        String garis = "=====================================================";
        return
            garis+"\n"+
            "   Pegawai             : "+getNama()+"\n"+
            "   No. KTP             : "+getNoKTP()+"\n"+
            garis
        ;
    }

    public double gaji(){
        double gaji = 2000000;
        return gaji;
    }
}
