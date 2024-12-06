package BaiTapOnTap.D21D02;

public class GioChuan {
    private GiangVien gv;
    private MonHoc mh;
    private Double gio;

    public GioChuan(GiangVien gv, MonHoc mh, Double gio) {
        this.gv = gv;
        this.mh = mh;
        this.gio = gio;
    }

    public GiangVien getGv() {
        return gv;
    }

    public Double getGio() {
        return gio;
    }
}
