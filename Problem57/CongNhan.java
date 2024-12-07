package BaiTapOnTap.Problem57;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CongNhan implements Comparable<CongNhan> {
    private String mnv, name, vao, ra;

    public CongNhan(String mnv, String name, String vao, String ra) {
        this.mnv = mnv;
        this.name = name;
        this.vao = vao;
        this.ra = ra;
    }

    public Map<String, Integer> getSoGioLam() {
        Map<String, Integer> soGioLam = new HashMap<String, Integer>();
        int gioVao = Integer.parseInt(vao.split(":")[0]);
        int phutVao = Integer.parseInt(vao.split(":")[1]);
        int gioRa = Integer.parseInt(ra.split(":")[0]);
        int phutRa = Integer.parseInt(ra.split(":")[1]);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime vaoDate = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), gioVao, phutVao);
        LocalDateTime raDate = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), gioRa, phutRa);

        Duration duration = Duration.between(vaoDate, raDate);

        soGioLam.put("hour", (int) duration.toHours() - 1);
        soGioLam.put("minute", (int) duration.toMinutes() % 60);
        soGioLam.put("du", (int) duration.toHours() - 1 - 8);

        return soGioLam;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d gio %d phut %s", mnv, name, getSoGioLam().get("hour"), getSoGioLam().get("minute"), getSoGioLam().get("du") >= 0 ? "DU" : "THIEU");
    }

    @Override
    public int compareTo(CongNhan o) {
        if (Objects.equals(getSoGioLam().get("hour"), o.getSoGioLam().get("hour"))) {
            if (Objects.equals(getSoGioLam().get("minute"), o.getSoGioLam().get("minute"))) {
                return this.mnv.compareTo(o.mnv);
            }
            return o.getSoGioLam().get("minute").compareTo(getSoGioLam().get("minute"));
        }
        return o.getSoGioLam().get("hour").compareTo(getSoGioLam().get("hour"));
    }
}
