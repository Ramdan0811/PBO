    package produk;

    public final class coil extends vape{
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
        public coil get(int i) {
            return null;
        }
        @Override
        public void DataToko(){
        super.DataToko();
        System.out.println("Jenis Coil                     : " + jenisc);
        System.out.println("Jumlah Gulungan                : " + gulungan);
        }
    }
