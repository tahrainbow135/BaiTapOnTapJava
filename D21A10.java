package BaiTapOnTap;

import java.util.*;

public class D21A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextDouble());
        }
        Collections.sort(list);
        double min = list.get(0);
        double max = list.get(list.size() - 1);
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != min && list.get(i) != max) {
                sum += list.get(i);
                cnt++;
            }
        }
        sum = sum / cnt;
        System.out.printf("%.2f", sum);
    }
}
