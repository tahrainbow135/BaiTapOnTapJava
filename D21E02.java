
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class D21E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {            
            int n = sc.nextInt();
            int step = 0;
            HashMap <Integer, Integer> map = new HashMap<>();
            Deque <Integer> deque = new LinkedList<>();
            deque.push(n);
            map.put(n, 0);
            while (!deque.isEmpty()) {    
                int temp = deque.poll();
                step = map.get(temp);
                if (temp == 2) {
                    break;
                }
                if (!map.containsKey(temp - 1)) {
                    map.put(temp-1, step + 1);
                    deque.addLast(temp-1);
                }
                for (int i = 2; i <= Math.sqrt(temp); i++) {
                    if (temp % i == 0) {
                        if (!map.containsKey(temp/i)) {
                            map.put(temp/i, step + 1);
                            deque.addLast(temp/i);         
                        }
                    }
                }
            }
            System.out.println(step+1);
        }
        sc.close();
    }
}
