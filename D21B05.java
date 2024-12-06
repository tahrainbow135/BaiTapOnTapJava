package BaiTapOnTap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D21B05 {
    public static boolean check(int n) {
        String s = String.valueOf(n);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - '0' < s.charAt(i - 1) - '0') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ArrayList<Integer> data1 = (ArrayList<Integer>) ois.readObject();
        ois.close();
        int[] map1 = new int[10005];
        data1.forEach(e -> map1[e]++);
        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList<Integer> data2 = (ArrayList<Integer>) ois.readObject();
        ois.close();
        int[] map2 = new int[10005];
        data2.forEach(e -> map2[e]++);
        Collections.sort(data1);
        for (Integer i : data1) {
            if (check(i) && map2[i] > 0) {
                System.out.println(i  + " " + map1[i] + " " + map2[i]);
                map2[i] = 0;
            }
        }
    }
}
