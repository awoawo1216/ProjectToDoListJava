import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        System.out.println("=== Program To-Do List Sederhana ===");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Daftar Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = input.nextInt();
            input.nextLine(); // bersihkan buffer

            if (pilihan == 1) {
                System.out.print("Masukkan nama tugas: ");
                String tugas = input.nextLine();
                todoList.add(tugas);
                System.out.println("Tugas \"" + tugas + "\" berhasil ditambahkan!");
            } 
            else if (pilihan == 2) {
                System.out.println("\nDaftar Tugas:");
                if (todoList.isEmpty()) {
                    System.out.println("(Belum ada tugas)");
                } else {
                    for (int i = 0; i < todoList.size(); i++) {
                        System.out.println((i + 1) + ". " + todoList.get(i));
                    }
                }
            } 
            else if (pilihan == 3) {
                System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                int index = input.nextInt();
                input.nextLine();
                if (index > 0 && index <= todoList.size()) {
                    String removed = todoList.remove(index - 1);
                    System.out.println("Tugas \"" + removed + "\" telah dihapus.");
                } else {
                    System.out.println("Nomor tidak valid!");
                }
            } 
            else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan program To-Do List!");
                break;
            } 
            else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        input.close();
    }
}
