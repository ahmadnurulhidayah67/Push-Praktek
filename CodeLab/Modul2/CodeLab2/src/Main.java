public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110067";
        rekening2.nomorRekening = "202410370110066";

        rekening1.namaPemilik = "Ahmad Nurul Hidayah";
        rekening2.namaPemilik = "Muhammad Hazza";

        rekening1.saldo = 6000000;
        rekening2.saldo = 7500000;

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(2000000);
        rekening2.setorUang(2000000);
        System.out.println();

        rekening1.tarikUang(9000000);
        rekening2.tarikUang(4000000);
        System.out.println();

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

    }
}