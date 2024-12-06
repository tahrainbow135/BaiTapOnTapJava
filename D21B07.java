package BaiTapOnTap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D21B07 {
    public static long chuyendoi(String s) {
        long cnt = 0, res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            res += (long) (Math.pow(2, cnt) * (Integer.parseInt(s.substring(i, i + 1))));
            cnt++;
        }
        return res;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA,in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        ois.close();
//        List<String> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            list.add(sc.next());
//        }
        for (String s : list) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1' || s.charAt(i) == '0') {
                    tmp.append(s.charAt(i));
                }
            }
            long res = chuyendoi(tmp.toString());
            System.out.println(tmp + " " + res);
        }
    }
}
