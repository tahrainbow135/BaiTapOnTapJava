package BaiTapOnTap.D21C01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<SinhVien>();
        while (t-- > 0) {
            String hoten = sc.nextLine();
            String[] tmp = sc.nextLine().split(" ");
            int sobai = Integer.parseInt(tmp[0]);
            int submit = Integer.parseInt(tmp[1]);
            list.add(new SinhVien(hoten, sobai, submit));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
