import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("5")) {
            System.out.println("Sistem Penjualan Vape Store:");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Update item");
            System.out.println("4. Lihat Semua items");
            System.out.println("5. Quit");
            System.out.println("Enter a number to choose an option:");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Menambah Data:");
                    String itemToAdd = scanner.nextLine();
                    items.add(itemToAdd);
                    System.out.println("Data sukses ditambahkan.");
                    break;
                case "2":
                    System.out.println("Hapus data Data:");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToRemove < 0 || indexToRemove >= items.size()) {
                        System.out.println("Tidak ada data yang tersimpan.");
                    } else {
                        items.remove(indexToRemove);
                        System.out.println("Data sukses diubah .");
                    }
                    break;
                case "3":
                    System.out.println("Masukkan Index yang mau dirubah:");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToUpdate < 0 || indexToUpdate >= items.size()) {
                        System.out.println("Index tidak ditemukan.");
                    } else {
                        System.out.println("Masukkan nama yang ingin diubah:");
                        String updatedItem = scanner.nextLine();
                        items.set(indexToUpdate, updatedItem);
                        System.out.println("Data sukses diubah.");
                    }
                    break;
                case "4":
                    if (items.isEmpty()) {
                        System.out.println("Tidak ada data.");
                    } else {
                        System.out.println("Data Vape Store:");
                        for (String item : items) {
                            System.out.println(item);
                        }
                    }
                    break;
                case "5":
                    System.out.println("Keluarkan Sudah...");
                    break;
                default:
                    System.out.println("Tidak ada dipilihan.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
