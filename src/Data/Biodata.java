package Data;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Biodata {
    private String nama;
    private LocalDate tanggalLahir;
    private String alamat;

    public String getUsia() {
        LocalDate currentDate = LocalDate.now();
        Period usia = Period.between(tanggalLahir, currentDate);
        return usia.getYears() + " tahun, " + usia.toTotalMonths() + " bulan, " + usia.getDays() + " hari.";
    }

    public String getNama() {
        return ": "+ nama ;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        this.tanggalLahir = LocalDate.of(tahun, bulan, tanggal);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) { this.alamat = alamat;
    }
}
