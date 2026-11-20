public abstract class Rekening {
    private int nomor;
    private String pemilik;
    private int saldo;

    public Rekening(int nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public void tambahSaldo(int jumlah) {
        saldo += jumlah;
    }

    public abstract int biayaAdmin();

    // kontrak: true kalau berhasil, false kalau gagal, tidak pernah melempar exception
    public abstract boolean tarik(int jumlah);

    public abstract String keterangan();

    protected static String formatRupiah(int angka) {
        return "Rp" + String.format("%,d", angka).replace(',', '.');
    }
}