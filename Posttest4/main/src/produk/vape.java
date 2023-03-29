package produk;

    class Vape {
    private int id;
    private String brand;
    private String model;
    private double harga;

    public Vape(int id, String brand, String model, double harga) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Vape{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", harga=" + harga +
                '}';
    }

    public void DataToko(){
        System.out.println("Nama Brand                     : " + brand );
        System.out.println("Model Vape                     : " + model );
        System.out.println("Harga Vape                     : " + harga );
    }
}


