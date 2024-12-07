package BaiTapOnTap.J07053;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<ThiTuyen> l = new ArrayList<ThiTuyen>();
        for (int i = 0; i < t; i++) {
            String mts = String.format("PH%02d",i + 1);
            String name = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate ns = LocalDate.parse(sc.nextLine(), formatter);
            double diemlt = Double.parseDouble(sc.nextLine());
            double diemth = Double.parseDouble(sc.nextLine());
            l.add(new ThiTuyen(mts, name, ns, diemlt, diemth));
        }
        l.forEach(System.out::println);
    }
}
