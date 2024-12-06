package BaiTapOnTap.D21C05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        List<Phim> list = new ArrayList<>();
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String theloai = sc.nextLine();
            map.put(String.format("TL%03d", i + 1),theloai);
        }
        for (int i = 0; i < m; i++) {
            String theloai = map.get(sc.nextLine());
            String date = sc.nextLine();
            String hoten = sc.nextLine();
            int sotap = Integer.parseInt(sc.nextLine());
            list.add(new Phim(i + 1, theloai, hoten, date, sotap));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
