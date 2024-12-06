package BaiTapOnTap.BaoCaoThucTapCoSo;

public class NhiemVu implements Comparable<NhiemVu> {
    private SinhVien sv;
    private DeTai deTai;
    private String hoiDong;

    public NhiemVu(SinhVien sv, DeTai deTai, String hoiDong) {
        this.sv = sv;
        this.deTai = deTai;
        this.hoiDong = hoiDong;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", this.sv.getId(), this.sv.getName(), this.sv.getPhone(), this.sv.getEmail(), this.deTai.getGv(), this.deTai.getName());
    }

    @Override
    public int compareTo(NhiemVu o) {
        return this.deTai.getName().compareTo(o.deTai.getName());
    }
}
