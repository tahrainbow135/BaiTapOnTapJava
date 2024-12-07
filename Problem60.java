package BaiTapOnTap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem60 {
    public static boolean check(int n) {
        if (n < 2) return false;
        else if (n % 2 == 0 && n != 2) return false;
        else if (n %3 == 0 && n != 3) return false;
        else {
            int tmp = (int) (Math.sqrt(n) + 1);
            for (int i = 5; i < tmp; i++) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        List<Integer> data1 = (ArrayList<Integer>) ois.readObject();
        ois.close();
        int[] map1 = new int[10005];
        data1.forEach(e -> map1[e]++);
        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        List<Integer> data2 = (ArrayList<Integer>) ois.readObject();
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
