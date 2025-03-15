class StatusBanjir {
    // Atribut
    private String status;
    private int tinggi_banjir;

    // Constructor
    public StatusBanjir(int tinggi_banjir) {
        this.tinggi_banjir = tinggi_banjir;
        check_status();
    }

    // Method untuk mengecek status banjir
    public void check_status() {
        if (tinggi_banjir >= 0 && tinggi_banjir <= 25) {
            status = "AMAN";
        } else if (tinggi_banjir >= 26 && tinggi_banjir <= 50) {
            status = "SIAGA I";
        } else if (tinggi_banjir >= 51 && tinggi_banjir <= 100) {
            status = "AWAS";
        } else {
            status = "TIDAK VALID";
        }
    }

    // Method untuk menampilkan atribut
    public void show_attributes() {
        System.out.println("Tinggi Banjir: " + tinggi_banjir + " cm");
        System.out.println("Status: " + status);
    }

    // Main method untuk menjalankan program
    public static void Identitas(String[] args) {
        // Contoh instansiasi objek
        StatusBanjir banjir1 = new StatusBanjir(40);
        banjir1.show_attributes();
    }
}
