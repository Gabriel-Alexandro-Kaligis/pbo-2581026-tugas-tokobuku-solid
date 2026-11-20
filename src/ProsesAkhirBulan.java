public class ProsesAkhirBulan {
    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening rekening : semua) {
            int admin = rekening.biayaAdmin();
            rekening.tambahSaldo(-admin);
            System.out.printf("%-3d %-11s: %s%n", rekening.getNomor(), "biaya admin", Rekening.formatRupiah(admin));
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {
        for (BerBunga rekening : berbunga) {
            int bunga = (int) (rekening.getSaldo() * rekening.getSukuBunga() / 100);
            rekening.tambahSaldo(bunga);
            System.out.printf("%-3d %-11s: %s%n", rekening.getNomor(), "bunga", Rekening.formatRupiah(bunga));
        }
    }

    public void autodebet(Rekening[] semua, int jumlah) {
        for (Rekening rekening : semua) {
            boolean berhasil = rekening.tarik(jumlah);
            if (berhasil) {
                System.out.printf("%-3d %-11s: %s%n", rekening.getNomor(), "autodebet", Rekening.formatRupiah(jumlah));
            } else {
                System.out.printf("%-3d %-11s: gagal%n", rekening.getNomor(), "autodebet");
            }
        }
    }
}