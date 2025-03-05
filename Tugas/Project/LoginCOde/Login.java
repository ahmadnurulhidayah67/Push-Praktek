import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        // Percabangan berdasarkan pilihan
        if (pilihan == 1) {
            // Login sebagai Admin
            scanner.nextLine(); // membersihkan newline setelah nextInt()
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Validasi login Admin
            String usernameValid = "Admin067";  // Username valid untuk admin
            String passwordValid = "Password067";  // Password valid untuk admin

            if (username.equals(usernameValid) && password.equals(passwordValid)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            scanner.nextLine(); // membersihkan newline setelah nextInt()
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Validasi login Mahasiswa
            String namaValid = "Ahmad Nurul Hidayah";  // Nama valid untuk mahasiswa
            String nimValid = "202410370110067";  // NIM valid untuk mahasiswa

            if (nama.equals(namaValid) && nim.equals(nimValid)) {
                System.out.println("Login Mahasiswa berhasil!");
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        // Menutup scanner setelah selesai
        scanner.close();
    }
}