package BaiTapOnTap.D21C03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SinhVien implements Comparable<SinhVien>{
    private String hoten;
    private LocalDateTime vao, ra;
    private long time;
    SinhVien(String hoten, String vao, String ra) {
        this.hoten = hoten;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.vao = LocalDateTime.parse(vao, formatter);
        this.ra = LocalDateTime.parse(ra, formatter);
        this.time = setTime();
    }
    public long setTime() {
        Duration duration = Duration.between(this.vao, this.ra);
        return duration.toMinutes();
    }
    @Override
    public int compareTo(SinhVien o) {
        if (this.time == o.time) {
            return this.hoten.compareTo(o.hoten);
        }
        return (int) (o.time - this.time);
    }
    @Override
    public String toString() {
        return hoten + " " + time;
    }
}
