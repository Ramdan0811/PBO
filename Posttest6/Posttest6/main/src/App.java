import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import produk.*;
import java.io.BufferedReader;
// import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static ArrayList<liquid> LiquidList = new ArrayList<>();
    private static ArrayList<coil> CoilList = new ArrayList<>();
    private static int idCounter = 1;
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Tambah Data Vape");
            System.out.println("2. Lihat Vape List");
            System.out.println("3. Update Data Vape");
            System.out.println("4. Delete Data Vape");
            System.out.println("5. Exit");

            System.out.print("Pilih option: ");
            int Menu = Integer.parseInt(br.readLine());

            switch (Menu) {
                case 1:
                    addVape();
                    break;
                case 2:
                    viewVapeList();
                    break;
                case 3:
                    updateVape();
                    break;
                case 4:
                    deleteVape();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Pilihan.");
                    break;
            }
        }
    }

    public static void addVape() throws IOException {
    System.out.println("========== Data Vape Store  ==========================");
    System.out.println("1. Tambah Liquid");
    System.out.println("2. Tambah Coil ");
    System.out.println("======================================================");
    System.out.print("Menu : ");
    int Menu = Integer.parseInt(br.readLine());
    
    System.out.println("========== Data Vape Store ==========");
    if(Menu == 1){
        int id = LiquidList.size() + 1;
        System.out.print("Masukkan Brand           : ");
        String brand = br.readLine();
        System.out.print("Masukkan Model           : ");
        String model = br.readLine();
        System.out.print("Masukkan harga           : ");
        Double harga = Double.parseDouble(br.readLine());
        System.out.print("Masukkan nama Liquid     : ");
        String nama = br.readLine();
        System.out.print("Masukkan jenis Liquid    : ");
        String jenis = br.readLine();
        liquid liquid = new liquid(id, brand, model, harga, nama, jenis);
        LiquidList.add(liquid);
        }
        else if(Menu == 2){
        int id = CoilList.size() + 1;
        System.out.print("Masukkan Brand           : ");
        String brand = br.readLine();
        System.out.print("Masukkan Model           : ");
        String model = br.readLine();
        System.out.print("Masukkan harga           : ");
        Double harga = Double.parseDouble(br.readLine());
        System.out.print("Masukkan jenis Coil      : ");
        String jenisc = br.readLine();
        System.out.print("Masukkan Jumlah Gulungan : ");
        String gulungan = br.readLine();
        coil coil = new coil(id, brand, model, harga, jenisc, gulungan);
        CoilList.add(coil);
        }
    }

    private static void viewVapeList() throws IOException {
        System.out.println("========== Data Vape Store  ==========================");
        System.out.println("1. Data Liquid");
        System.out.println("2. Data Coil ");
        System.out.println("======================================================");
        System.out.print("Pilih Nomor: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            System.out.println("-Data Liquid-");  
            if (LiquidList.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < LiquidList.size();i++){
                System.out.println("Produk Ke-" + (i));
                LiquidList.get(i).DataToko();
                    }
                }
                System.out.println("\n-------------------------------------------------");
        }else if(pil == 2){
            System.out.println("-Data Coil-");  
            if (CoilList.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < CoilList.size();i++){
                CoilList.get(i).DataToko();
                }
            }
                System.out.println("\n-------------------------------------------------");
        }else{
            System.out.println("Pilihan tidak ada!");

        }
    }     

    private static void updateVape() throws IOException {
    System.out.println("========== Data Vape Store ===========================");
    System.out.println("1. Ubah Data Liquid");
    System.out.println("2. Ubah Data Coil ");
    System.out.println("======================================================");
    System.out.print("Menu : ");
    int Menu = Integer.parseInt(br.readLine());
    System.out.println("========== Data Vape Store ==========");
    if(Menu == 1){
            System.out.print("Cari Nama : ");
            String Cari = br.readLine();
            for(int i= 0; i < LiquidList.size(); i++){
                liquid liquid = LiquidList.get(i);
                if(liquid.getNama().equals(Cari)){
                    int idbaru = i;
                    System.out.print("Masukkan Brand           : ");
                    String brand = br.readLine();
                    System.out.print("Masukkan Model           : ");
                    String model = br.readLine();
                    System.out.print("Masukkan harga           : ");
                    Double harga = Double.parseDouble(br.readLine());
                    System.out.print("Masukkan nama Liquid     : ");
                    String nama = br.readLine();
                    System.out.print("Masukkan jenis Liquid    : ");
                    String jenis = br.readLine();
                    liquid liquidupd = new liquid(idbaru, brand, model, harga, nama, jenis);
                    LiquidList.set(i, liquidupd);
                }
            }
    }else if(Menu == 2){
            System.out.print("Cari Nama : ");
            String Cari = br.readLine();
            for(int i= 0; i < CoilList.size(); i++){
                coil coil = CoilList.get(i);
                if(coil.getBrand().equals(Cari)){
                    int idbaru = i;
                    System.out.print("Masukkan Brand           : ");
                    String brand = br.readLine();
                    System.out.print("Masukkan Model           : ");
                    String model = br.readLine();
                    System.out.print("Masukkan harga           : ");
                    Double harga = Double.parseDouble(br.readLine());
                    System.out.print("Masukkan jenis Coil      : ");
                    String jenisc = br.readLine();
                    System.out.print("Masukkan Jumlah Gulungan : ");
                    String gulungan = br.readLine();
                    coil coilupd = new coil(idbaru, brand, model, harga, jenisc, gulungan);
                    CoilList.set(i,coilupd);
                }
            }
    }else{
        System.out.println("Invalid Input!!! ");
        System.out.println("=========================================");
    }
}

private static void deleteVape() {
    if (LiquidList.isEmpty()) {
        System.out.println("Daftar vape kosong.");
    } else {
        System.out.print("Masukkan vape ID: ");
        int id = scanner.nextInt();

        boolean isVapeFound = false;
        for (int i = 0; i < LiquidList.size(); i++) {
            if (LiquidList.get(i).getId() == id) {
                LiquidList.remove(i);
                System.out.println("Vape Berhasil dihapus.");
                isVapeFound = true;
                break;
            }
        }

        if (!isVapeFound) {
            System.out.println("Vape Tidak Ditemukan.");
        }
    }
}
}