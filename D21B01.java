package BaiTapOnTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class D21B01 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger sum = new BigInteger("0");
        BigInteger tich = new BigInteger("1");
        while (sc.hasNext()) {
            BigInteger x = sc.nextBigInteger();
            sum = sum.add(x);
            tich = tich.multiply(x);
        }
        System.out.println(sum + "\n" + tich);
    }
}
