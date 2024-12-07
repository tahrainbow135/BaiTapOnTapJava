package BaiTapOnTap.ToChucICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ToChucICPC {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] split = line.split(" ");
            String tmp = "";
            for (int j = 1; j < split.length; j++) {
                tmp += split[j] + " ";
            }
            map.put(split[0], tmp);
        }
        List<DoiThi> doiThis = new ArrayList<>();
        sc = new Scanner(new File("REGISTER.in"));
        n = Integer.parseInt(sc.nextLine());
        int dem = 0;
        for (int i = 0; i < n; i++) {
            String[] split = sc.nextLine().split(" ");
            int t  = Integer.parseInt(split[1]);
            for (int j = 0; j < t; j++) {
                String line = sc.nextLine();
                doiThis.add(new DoiThi("", map.get(split[0]), line));
            }
        }
        Collections.sort(doiThis);
        for (DoiThi doiThi : doiThis) {
            dem++;
            doiThi.setMadoi(String.format("team%02d", dem));
            System.out.println(doiThi);
        }
    }
}
