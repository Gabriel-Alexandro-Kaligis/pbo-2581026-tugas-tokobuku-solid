public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(int nomor, String pemilik, int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public int biayaAdmin() {
        return 15000;
    }

    @Override
    public boolean tarik(int jumlah) {
        if (getSaldo() - jumlah < -batasOverdraft) {
            return false;
        }
        tambahSaldo(-jumlah);
        return true;
    }

    @Override
    public String keterangan() {
        return "Giro, batas overdraft " + formatRupiah(batasOverdraft);
    }
}