package BaiTapOnTap.HuongDanDoAnTotNghiep;

public class DoAn implements Comparable<DoAn> {
    private String name;
    private SinhVien sv;
    private GiangVien gv;

    public DoAn(String name, SinhVien sv, GiangVien gv) {
        this.name = name;
        this.sv = sv;
        this.gv = gv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(DoAn o) {
        return this.sv.getMsv().compareTo(o.sv.getMsv());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.sv.getMsv(), this.sv.getHoTen(), this.gv.getHoTen(), this.name, this.sv.getSdt());
    }
}
