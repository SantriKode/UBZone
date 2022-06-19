public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah){
        this.upah = upah;
    }

    public double  getUpah(){
        return this.upah;
    }

    @Override
    public String toString(){
        String garis = "||=====================================================||";
        return 
            garis+"\n"+
            "   Pegawai Tetap       : "+getNama()+"\n"+
            "   No. KTP             : "+getNoKTP()+"\n"+
            "   Pendapatan          : Rp "+(int)gaji()+"\n"+
            garis
        ;
    }

    @Override
    public double gaji(){
        return getUpah();
    }

}
