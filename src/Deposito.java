public class Deposito extends Rekening implements BerBunga {
    private double sukuBunga;

    public Deposito(int nomor, String pemilik, int saldo, double sukuBunga) {
        super(nomor, pemilik, saldo);
        this.sukuBunga = sukuBunga;
    }

    @Override
    public int biayaAdmin() {
        return 0;
    }

    @Override
    public boolean tarik(int jumlah) {
        return false;
    }

    @Override
    public double getSukuBunga() {
        return sukuBunga;
    }
 ""
    @Override
    public String keterangan() {
        return "Deposito, bunga " + sukuBunga + "% per bulan";
    }
}