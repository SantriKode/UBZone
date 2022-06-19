public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        this. penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan(){
        return this.penjualan;
    }

    public double getKomisi(){
        return this.komisi;
    }

    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi){
        this.komisi = komisi;
    }

    @Override
    public String toString(){
        String garis = "||=====================================================||";
        return 
            garis+"\n"+
            "   Sales               : "+getNama()+"\n"+
            "   No. KTP             : "+getNoKTP()+"\n"+
            "   Total Penjualan     : "+getPenjualan()+"\n"+
            "   Besaran Komisi      : "+getKomisi()+"\n"+
            "   Pendapatan          : Rp "+(int)gaji()+"\n"+
            garis
        ;
    }

    @Override
    public double gaji(){
        double totalGaji = getPenjualan()*getKomisi();
        return totalGaji;
    }

}
