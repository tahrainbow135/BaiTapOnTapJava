package BaiTapOnTap.D21C02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<SinhVien> list = new ArrayList<SinhVien>();
        while (sc.hasNextLine()) {
            String msv = sc.nextLine();
            String hoten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            list.add(new SinhVien(msv, hoten, lop, email, sdt));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
