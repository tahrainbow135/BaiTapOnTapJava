package BaiTapOnTap.Problem57;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<CongNhan> ds = new ArrayList<CongNhan>();
        for (int i = 1; i <= n; i++) {
            String mnv = sc.nextLine();
            String name = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();

            CongNhan cn = new CongNhan(mnv, name, vao, ra);
            ds.add(cn);
        }
        Collections.sort(ds);
        ds.forEach(System.out::println);
    }
}
/*
2
01T
Nguyen Van An
08:00
17:30
06T
Tran Hoa Binh
09:05
17:00
 */