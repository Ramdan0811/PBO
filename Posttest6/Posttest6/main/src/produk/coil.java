    package produk;

    public final class coil extends vape implements coilinterface{
        private String jenisc;
        private String gulungan;

        public final String produk = "Coil";

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
        public coilinterface get(int i) {
            return null;
        }
        @Override
        public void DataToko(){
        super.DataToko();
        System.out.println("Jenis Coil                     : " + jenisc);
        System.out.println("Jumlah Gulungan                : " + gulungan);
        System.out.println("Tahun Produksi                 : " + Tahun_Produksi());
       System.out.println("Made in                         : " + Made_In());
        }
        @Override
        public String Tahun_Produksi(){
            return "2020";
        }
        @Override
        public String Made_In(){
            return "Indonesia ";
        }

        @Override
        public void Vape() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'Vape'");
        }
    }
