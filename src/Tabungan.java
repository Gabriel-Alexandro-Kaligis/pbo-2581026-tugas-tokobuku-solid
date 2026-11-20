public class Tabungan extends Rekening implements BerBunga {
    private double sukuBunga;

    public Tabungan(int nomor, String pemilik, int saldo, double sukuBunga) {
        super(nomor, pemilik, saldo);
        this.sukuBunga = sukuBunga;
    }

    @Override
    public int biayaAdmin() {
        return getSaldo() < 500000 ? 5000 : 0;
    }

    @Override
    public boolean tarik(int jumlah) {
        if (getSaldo() < jumlah) {
            return false;
        }
        tambahSaldo(-jumlah);
        return true;
    }

    @Override
    public double getSukuBunga() {
        return sukuBunga;
    }

    @Override
    public String keterangan() {
        return "Tabungan, bunga " + sukuBunga + "% per bulan";
    }
}