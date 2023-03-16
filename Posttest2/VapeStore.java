import java.util.ArrayList;
import java.util.Scanner;

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
}

public class VapeStore {
    private static ArrayList<Vape> vapeList = new ArrayList<>();
    private static int idCounter = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Tambah Data Vape");
            System.out.println("2. Lihat Vape List");
            System.out.println("3. Update Data Vape");
            System.out.println("4. Delete Data Vape");
            System.out.println("5. Exit");

            System.out.print("Pilih option: ");
            int option = scanner.nextInt();

            switch (option) {
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

    private static void addVape() {
        System.out.print("Masukkan Brand: ");
        String brand = scanner.next();

        System.out.print("Masukkan model: ");
        String model = scanner.next();

        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();

        Vape vape = new Vape(idCounter++, brand, model, harga);
        vapeList.add(vape);

        System.out.println("Vape Berhasil ditambahkan.");
    }

    private static void viewVapeList() {
        if (vapeList.isEmpty()) {
            System.out.println("Daftar vape kosong.");
        } else {
            for (Vape vape : vapeList) {
                System.out.println(vape);
            }
        }
    }

    private static void updateVape() {
        if (vapeList.isEmpty()) {
            System.out.println("Daftar vape kosong.");
        } else {
            System.out.print("Masukkan vape ID: ");
            int id = scanner.nextInt();

            boolean isVapeFound = false;
            for (Vape vape : vapeList) {
                if (vape.getId() == id) {
                    System.out.print("Masukkan brand (press enter to skip): ");
                    String brand = scanner.next();
                    if (!brand.isEmpty()) {
                        vape.setBrand(brand);
                    }

                    System.out.print("Masukkan model (press enter to skip): ");
                   
                                    String model = scanner.next();
                if (!model.isEmpty()) {
                    vape.setModel(model);
                }

                System.out.print("Masukkan harga (press 0 to skip): ");
                double harga = scanner.nextDouble();
                if (harga != 0) {
                    vape.setHarga(harga);
                }

                System.out.println("Vape berhasil diubah.");
                isVapeFound = true;
                break;
            }
        }

        if (!isVapeFound) {
            System.out.println("Vape Tidak Ditemukan.");
        }
    }
}

private static void deleteVape() {
    if (vapeList.isEmpty()) {
        System.out.println("Daftar vape kosong.");
    } else {
        System.out.print("Masukkan vape ID: ");
        int id = scanner.nextInt();

        boolean isVapeFound = false;
        for (int i = 0; i < vapeList.size(); i++) {
            if (vapeList.get(i).getId() == id) {
                vapeList.remove(i);
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