package BaiTapOnTap.DongPhuc;


public class SinhVien implements Comparable<SinhVien> {
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;
    private String sdt;
    private String gioiTinh;

    public SinhVien(String maSV, String hoTen, String lop, String email, String sdt, String gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", maSV, hoTen, lop, email, sdt);
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }
}