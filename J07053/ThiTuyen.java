package BaiTapOnTap.J07053;

import java.time.LocalDate;

public class ThiTuyen {
    private String mts, name, res;
    private LocalDate ns;
    private double diemlt, diemth;
    private int diem, tuoi;
    ThiTuyen(String mts, String name, LocalDate ns, double diemlt, double diemth) {
        this.mts = mts;
        this.name = getName(name);
        this.ns = ns;
        this.diemlt = diemlt;
        this.diemth = diemth;
        this.diem = getDiem();
        this.res = setRes();
    }
    public String getName(String name) {
        String[] tmp = name.trim().split("\\s+");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < tmp.length; i++) {
            s.append(tmp[i].substring(0, 1).toUpperCase()).append(tmp[i].substring(1).toLowerCase()).append(" ");
        }
        return s.toString().trim();
    }
    public int getDiem() {
        double thuong = 0;
        if (this.diemlt >= 8 && this.diemth >= 8) {
            thuong = 1;
        }
        else if (this.diemlt >= 7.5 && this.diemth >= 7.5) {
            thuong = 0.5;
        }
        else {
            thuong = 0.0;
        }
        int diem = (int)Math.round((this.diemlt + this.diemth)/2 + thuong);
        return Math.min(diem, 10);
    }
    public String setRes() {
        if (this.diem < 5) {
            this.res = "Truot";
        }
        else if (this.diem <= 6) {
            this.res = "Trung binh";
        }
        else if (this.diem <= 7) {
            this.res = "Kha";
        }
        else if (this.diem <= 8) {
            this.res = "Gioi";
        }
        else if (this.diem == 9 || this.diem == 10) {
            this.res = "Xuat sac";
        }
        return this.res;
    }
    @Override
    public String toString() {
        return mts + " " + name + " " + String.valueOf(2021-ns.getYear()) + " " + diem + " " + res;
    }
}
