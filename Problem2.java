package BaiTapOnTap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char[] s1 = s.toCharArray();
            Arrays.sort(s1);
            String s2 = "";
            int sum = 0;
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] >= 'A' && s1[i] <= 'Z') {
                    s2 += s1[i];
                }
                else if (s1[i] >= '0' && s1[i] <= '9') {
                    sum += (s1[i] - '0');
                }
            }
            System.out.println(s2 + sum);
        }
    }
}
