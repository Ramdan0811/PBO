    package produk;

public final class liquid extends vape {
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

    public liquid get(int i) {
        return null;
    }
    @Override
    public void DataToko(){
       super.DataToko();
       System.out.println("Nama                           : " + nama);
       System.out.println("Jenis                          : " + jenis);
    }
    
    // overloading
    public void DataToko(boolean showID){
       if(showID) DataToko();
       else super.DataToko();
    }
}
