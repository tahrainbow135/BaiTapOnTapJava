package BaiTapOnTap.D21C05;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Phim implements Comparable<Phim>{
    private String mp, hoten, theloai, ngaychieu;
    private int sotap;
    Phim(int mp, String theloai, String hoten, String ngaychieu, int sotap) {
        this.mp = String.format("P%03d", mp);
        this.hoten = hoten;
        this.theloai = theloai;
        this.ngaychieu = ngaychieu;
        this.sotap = sotap;
    }
    @Override
    public int compareTo(Phim o) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (LocalDate.parse(this.ngaychieu, dtf).isEqual(LocalDate.parse(o.ngaychieu, dtf))) {
            if (this.hoten.equals(o.hoten)) {
                return o.sotap - this.sotap;
            }
            return this.hoten.compareTo(o.hoten);
        }
        return LocalDate.parse(this.ngaychieu, dtf).compareTo(LocalDate.parse(o.ngaychieu, dtf));
    }
    @Override
    public String toString() {
        return mp + " " + theloai + " " + ngaychieu + " " + hoten + " " + sotap;
    }
}
