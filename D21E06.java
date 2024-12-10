
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luumi
 */
public class D21E06 {
    public static int tinh(int n, int[] arr) {
        Stack <Integer> stack = new Stack<>();
        int res = 0, i = 0;
        while (i < n) {
            if (stack.isEmpty() || arr[i] >= arr[stack.peek()]) {
                stack.push(i);
                i += 1;
            }
            else {
                int vt = stack.pop();
                if (stack.isEmpty()) {
                    res = Integer.max(res, arr[vt] * i);
                }
                else {
                    res = Integer.max(res, arr[vt] * (i-stack.peek()-1));
                }
            }
        }
        while (!stack.isEmpty()) {            
            int vt = stack.pop();
            if (stack.isEmpty()) {
                res = Integer.max(res, arr[vt] * i);
            }
            else {
                res = Integer.max(res, arr[vt] * (i-stack.peek()-1));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = tinh(n, arr);
        for (int i = 0; i < n; i++) {
            arr[i] = m-arr[i];
        }
        res = Integer.max(res, tinh(n, arr));
        System.out.println(res);
        sc.close();
    }
}
