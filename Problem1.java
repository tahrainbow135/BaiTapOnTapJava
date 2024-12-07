package BaiTapOnTap;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int max = 0;
        while (sc.hasNext()) {
            String tmp = sc.next();
            list.add(tmp);
            map.put(tmp, tmp.length());
            if (tmp.length() > max) {
                max = tmp.length();
            }
        }
        for (String tmp : list) {
            if (map.get(tmp) == max) {
                System.out.println(tmp + " - " + max);
                break;
            }
        }
    }
}
