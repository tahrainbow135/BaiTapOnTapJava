package BaiTapOnTap;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            long sum = 0, tich = 1;
            for (int i = 0; i < s.length(); i+=2) {
                if (s.charAt(i) != '0') {
                    tich *= (s.charAt(i) - '0');
                }
            }
            for (int i = 1; i < s.length(); i+=2) {
                sum += (s.charAt(i) - '0');
            }
            System.out.println(tich + " " + sum);
        }
    }
}
