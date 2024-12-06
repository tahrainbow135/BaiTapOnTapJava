package BaiTapOnTap.BaoCaoThucTapCoSo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> dsSv = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.nextLine();
            String email = sc.nextLine();

            SinhVien sv = new SinhVien(msv, name, phone, email);
            dsSv.add(sv);
        }

        sc = new Scanner(new File("DETAI.in"));
        List<DeTai> dsDt = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            String gv = sc.nextLine();
            String name = sc.nextLine();

            DeTai dt = new DeTai(String.format("DT%03d", i), gv, name);
            dsDt.add(dt);
        }

        sc = new Scanner(new File("HOIDONG.in"));
        List<NhiemVu> dsNv = new ArrayList<>();
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= q; i++) {
            String[] input = sc.nextLine().split(" ");
            String msv = input[0];
            String id = input[1];
            String hd = input[2];

            SinhVien sv = null;
            DeTai dt = null;
            for (SinhVien e : dsSv) {
                if (e.getId().equals(msv)) {
                    sv = e;
                    break;
                }
            }

            for (DeTai d : dsDt) {
                if (d.getId().equals(id)) {
                    dt = d;
                }
            }

            NhiemVu nv = new NhiemVu(sv, dt, hd);
            dsNv.add(nv);
        }

        Collections.sort(dsNv);

        for (int i = 1; i <= 8; i++) {
            String h = String.format("HD%d0", i);
            System.out.println("DANH SACH HOI DONG %d:");
        }
    }
}
