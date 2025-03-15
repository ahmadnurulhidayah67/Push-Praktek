public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public void tampilkanInfo() {
        System.out.println("Nomor rekening : " + nomorRekening);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Saldo :Rp" + saldo);
        System.out.println();
    }

    public void setorUang(double jumlah) {
        saldo+=jumlah;
        System.out.println(namaPemilik+ " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    public void tarikUang(double jumlah) {
        if (saldo>=jumlah) {
            saldo-=jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + " (Berhasil) Saldo sekarang: Rp" + saldo);
        }else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + " (Gagal, Saldo tidak mencukupi) Saldo sekarang: Rp" + saldo);
        }
    }
}
