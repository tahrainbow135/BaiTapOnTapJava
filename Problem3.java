package BaiTapOnTap;

import java.util.Scanner;

public class Problem3 {
    public static long solution(long n) {
        long tmp = (long)Math.sqrt(n);
        long max = 0;
        for (long i = 2; i <= tmp; i++) {
            while (n % i == 0) {
                n /= i;
                max = i;
            }
        }
        if (n != 1) {
            max = n;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solution(n));
        }
    }
}
