    package produk;

public final class liquid extends vape implements liquidinterface {
    private String nama;
    private String jenis;

        public final String produk = "Liquid";

    public liquid (int id, String brand, String model, double harga,String nama, String jenis) {
        super(id, brand, model, harga);
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public liquidinterface get(int i) {
        return null;
    }
    @Override
    public void DataToko(){
       super.DataToko();
       System.out.println("Nama Liquid                    : " + nama);
       System.out.println("Jenis Liquid                   : " + jenis);
       System.out.println("Tahun Produksi                 : " + Tahun_Produksi());
       System.out.println("Made in                        : " + Made_In());
    }
    @Override
    public String Tahun_Produksi(){
        return "2022";
    }
    @Override
    public String Made_In(){
        return "Indonesia ";
    }
    
    // overloading
    public void DataToko(boolean showID){
       if(showID) DataToko();
       else super.DataToko();
    }

    @Override
    public void Vape() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Vape'");
    }
}
