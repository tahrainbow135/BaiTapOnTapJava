package BaiTapOnTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem58 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                long n = Long.parseLong(s);
                if (n > Math.pow(10, 9)) {
                    sum += n;
                }
            }
            catch (NumberFormatException e) {

            }
        }
        System.out.println(sum);
    }
}
