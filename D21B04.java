package BaiTapOnTap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class D21B04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        ois.close();
        Set<Integer> set = new TreeSet<>();
        for (String str : list) {
            try {
                int i = Integer.parseInt(str);
                set.add(i);
            }
            catch (NumberFormatException e) {

            }
        }
        set.forEach(System.out::println);
    }
}
