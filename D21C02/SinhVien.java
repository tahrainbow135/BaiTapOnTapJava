package BaiTapOnTap.D21C02;

public class SinhVien implements Comparable<SinhVien> {
    private String msv, hoten, lop, email, sdt;
    SinhVien(String msv, String hoten, String lop, String email, String sdt) {
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    @Override
    public int compareTo(SinhVien sv) {
        if (this.lop.equals(sv.lop)) {
            return this.msv.compareTo(sv.msv);
        }
        return this.lop.compareTo(sv.hoten);
    }
    @Override
    public String toString() {
        return msv + " " + hoten + " " + lop + " " + email + " " + sdt;
    }
}
