package BaiTapOnTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class D21B03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Set<BigInteger> set = new TreeSet<>();
        while (sc.hasNext()) {
            set.add(new BigInteger(sc.next()));
        }
        set.forEach(System.out::println);
    }
}
