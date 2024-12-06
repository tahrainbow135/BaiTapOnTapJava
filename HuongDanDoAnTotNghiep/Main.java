package BaiTapOnTap.HuongDanDoAnTotNghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<SinhVien> dsSv = new ArrayList<>();
        while (sc.hasNextLine()) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = 0 + sc.nextLine();

            SinhVien sv = new SinhVien(msv, name, lop, email, sdt);
            dsSv.add(sv);
        }

        sc = new Scanner(new File("HUONGDAN.in"));
        int m = Integer.parseInt(sc.nextLine());
        List<DoAn> dsDa = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String[] s = sc.nextLine().split(" ");
            String x = "";
            for (int k = 0; k < s.length - 1; k++) {
                x += s[k] + " ";
            }
            GiangVien gv = new GiangVien(x.trim());
            Integer soLuong = Integer.parseInt(s[s.length - 1].trim());

            for (int j = 0; j < soLuong; j++) {
                String[] input = sc.nextLine().split(" ");
                String msv = input[0];
                String tenDoAn = "";
                for (int t = 1; t < input.length; t++) {
                    tenDoAn += input[t] + " ";
                }

                SinhVien sv = null;
                for (SinhVien a : dsSv) {
                    if (a.getMsv().equals(msv)) {
                        sv = a;
                        break;
                    }
                }

                DoAn da = new DoAn(tenDoAn.trim(), sv, gv);
                dsDa.add(da);
            }
        }

        Collections.sort(dsDa);
        dsDa.forEach(System.out::println);
    }
}
