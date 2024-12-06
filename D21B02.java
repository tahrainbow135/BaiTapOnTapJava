package BaiTapOnTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class D21B02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Set<BigInteger> set = new TreeSet<>();
        BigInteger sum = new BigInteger("0");
        BigInteger tich = new BigInteger("1");
        while (sc.hasNext()) {
            BigInteger n = new BigInteger(sc.next());
            set.add(n);
        }
        for (BigInteger n : set) {
            sum = sum.add(n);
            tich = tich.multiply(n);
        }
        System.out.println(sum + "\n" + tich);
    }
}
