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
public class D21E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {            
            int n = sc.nextInt();
            Stack <Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    st.push(sc.nextInt());
                }
                else {
                    String c = sc.next();
                    int temp2 = st.pop(), temp1 = st.pop();
                    if (c.equals("+")) {
                        st.push(temp1 + temp2);
                    }
                    else if (c.equals("-")) {
                        st.push(temp1 - temp2);
                    }
                    else if (c.equals("*")) {
                        st.push(temp1 * temp2);
                    }
                    else {
                        st.push(temp1/temp2);
                    }
                }    
            }
            System.out.println(st.peek());
        }
        sc.close();
    }
}
