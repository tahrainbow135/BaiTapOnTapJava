package BaiTapOnTap.ToChucICPC;

public class DoiThi implements Comparable<DoiThi> {
    private String madoi, school, name;
    DoiThi(String madoi, String school, String name) {
        this.madoi = madoi;
        this.school = school;
        this.name = name;
    }

    public void setMadoi(String madoi) {
        this.madoi = madoi;
    }

    @Override
    public int compareTo(DoiThi o) {
        if (this.school.equals(o.school)) {
            return this.name.compareTo(o.name);
        }
        return this.school.compareTo(o.school);
    }
    @Override
    public String toString() {
        return this.madoi + " " + this.name + " " + this.school;
    }
}
