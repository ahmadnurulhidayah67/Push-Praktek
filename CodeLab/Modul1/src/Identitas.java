import java.util.Scanner;

public class Identitas {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta pengguna memasukkan jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Meminta pengguna memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur pengguna berdasarkan tahun lahir
        int tahunSekarang = 2025;
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin berdasarkan input
        String jenisKelaminString;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminString = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminString = "Perempuan";
        } else {
            jenisKelaminString = "Jenis kelamin tidak valid";
        }

        // Menampilkan hasil
        System.out.println("\nData Diri Pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminString);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup Scanner setelah selesai
        scanner.close();
    }
}