package BaiTapOnTap.DongPhuc;

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
        List<SinhVien> dsSV = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String phone = sc.nextLine();
            String gender = sc.nextLine();

            SinhVien sinhVien = new SinhVien(msv, name, lop, email, phone, gender);
            dsSV.add(sinhVien);
        }

        sc = new Scanner(new File("DANGKY.in"));
        List<DangKy> dsDK = new ArrayList<>();
        while (sc.hasNext()) {
            String msv = sc.next();
            String size = sc.next();

            DangKy dangKy = new DangKy(msv, size);
            dsDK.add(dangKy);
        }

        sc = new Scanner(new File("TRUYVAN.in"));

        int m = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= m; i++) {
            String gender = sc.next();
            String size = sc.next();
            List<SinhVien> res = new ArrayList<>();

            for (SinhVien sv: dsSV) {
                for (DangKy dk: dsDK) {
                    if (sv.getMaSV().equals(dk.getMaSV())) {
                        if (sv.getGioiTinh().equals(gender) && dk.getSizeAo().equals(size)) {
                            res.add(sv);
                        }
                    }
                }
            }

            Collections.sort(res);
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", gender.toUpperCase() ,size.toUpperCase());
            for (SinhVien sv: res) {
                System.out.println(sv);
            }
        }
        sc.close();
    }
}