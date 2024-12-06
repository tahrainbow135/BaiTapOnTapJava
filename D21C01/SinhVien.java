package BaiTapOnTap.D21C01;

public class SinhVien implements Comparable<SinhVien>{
    private String hoten;
    private int sobai, submit;
    SinhVien(String hoten, int sobai, int submit) {
        this.hoten = hoten;
        this.sobai = sobai;
        this.submit = submit;
    }
    @Override
    public int compareTo(SinhVien sv) {
        if(this.submit == sv.submit && this.sobai == sv.sobai){
            return this.hoten.compareTo(sv.hoten);
        }
        if (this.sobai == sv.sobai) {
            return this.submit - sv.submit;
        }
        return sv.sobai - this.sobai;
    }
    @Override
    public String toString() {
        return hoten + " " + sobai + " " + submit;
    }
}
