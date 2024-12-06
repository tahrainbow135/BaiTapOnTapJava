package BaiTapOnTap.D21C04;

public class MatHang implements Comparable<MatHang> {
    private String mmh, tenmh;
    private long slm, dongia, chietkhau, thanhtoan;
    MatHang(String mmh, String tenmh, long slm, long dongia, long chietkhau) {
        this.mmh = mmh;
        this.tenmh = tenmh;
        this.slm = slm;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
        this.thanhtoan = this.slm * this.dongia - this.chietkhau;
    }
    @Override
    public int compareTo(MatHang o) {
        return (int) (o.thanhtoan - this.thanhtoan);
    }
    @Override
    public String toString() {
        return mmh + " " + tenmh + " " + slm + " " + dongia + " " + chietkhau + " " + thanhtoan;
    }
}
