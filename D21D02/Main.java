package BaiTapOnTap.D21D02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> dsmh = new ArrayList<MonHoc>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String ma = input[0];
            String name = "";
            for (int j = 1; j < input.length; j++) {
                name += input[j] + " ";
            }
            MonHoc mh = new MonHoc(ma, name.trim());
            dsmh.add(mh);
        }

        sc = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc.nextLine());
        List<GiangVien> dsgv = new ArrayList<GiangVien>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String ma = input[0];
            String name = "";
            for (int j = 1; j < input.length; j++) {
                name += input[j] + " ";
            }

            GiangVien gv =  new GiangVien(ma, name.trim());
            dsgv.add(gv);
        }

        sc = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc.nextLine());
        List<GioChuan> dsgc = new ArrayList<GioChuan>();
        for (int i = 0; i < n; i++) {
            String maGv = sc.next();
            String maMh = sc.next();
            Double gio = Double.parseDouble(sc.next());

            MonHoc mh = null;
            for (MonHoc monHoc : dsmh) {
                if (monHoc.getMa().equals(maMh)) {
                    mh = monHoc;
                    break;
                }
            }

            GiangVien gv = null;
            for (GiangVien giangVien : dsgv) {
                if (giangVien.getMa().equals(maGv)) {
                    gv = giangVien;
                    break;
                }
            }

            GioChuan gc = new GioChuan(gv, mh, gio);
            dsgc.add(gc);
        }

        for (GiangVien giangVien : dsgv) {
            Double total = 0.0;
            for (GioChuan gioChuan : dsgc) {
                if (giangVien.getMa().equals(gioChuan.getGv().getMa())) {
                    total += gioChuan.getGio();
                }
            }
            System.out.println(giangVien.getTen() + " " + String.format("%.2f", total));
        }
    }
}
