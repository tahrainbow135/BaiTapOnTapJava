package BaiTapOnTap.HuongDanDoAnTotNghiep;

public class SinhVien {
    private String msv, hoTen, lop, email, sdt;

    public SinhVien(String msv, String hoTen, String lop, String email, String sdt) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    public String getMsv() {
        return msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSdt() {
        return sdt;
    }

}
