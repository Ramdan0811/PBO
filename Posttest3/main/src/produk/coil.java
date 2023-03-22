package produk;

public class coil extends Vape{
    private String jenisc;
    private String gulungan;

    public coil (int id, String brand, String model, double harga,String jenisc, String gulungan){
        super(id, brand, model, harga);
        this.jenisc = jenisc;
        this.gulungan = gulungan;
    }
    public String getJenisc() {
        return jenisc;
    }

    public void setJenisc(String jenisc) {
        this.jenisc = jenisc;
    }

    public String getGulungan() {
        return gulungan;
    }

    public void setGulungan(String gulungan) {
        this.gulungan = gulungan;
    }
    public coil get(int i) {
        return null;
    }
}
