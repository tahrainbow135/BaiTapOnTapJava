package BaiTapOnTap;
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
public class D21E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            Stack <Character> stack = new Stack<>();
            boolean check = true;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == '(') {
                    stack.push(string.charAt(j));
                }
                else if (string.charAt(j) == ')') {
                    if (stack.peek() == '(') {
                        check = false;
                        break;
                    }
                    else {
                        stack.pop();
                        stack.pop();
                    }
                }
                else {
                    if (stack.peek() == '(') {
                        stack.push(string.charAt(j));
                    }
                }
            }
            if (check) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
