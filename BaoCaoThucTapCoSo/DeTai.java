package BaiTapOnTap.BaoCaoThucTapCoSo;

public class DeTai {
    private String id, gv, name;

    public DeTai(String id, String gv, String name) {
        this.id = id;
        this.gv = gv;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getGv() {
        return gv;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
