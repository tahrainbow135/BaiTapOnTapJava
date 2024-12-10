
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luumi
 */
public class D21E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        ArrayList <Pair<Integer, Integer>> ListError = new ArrayList<>();
        ArrayList <Pair<Integer, Integer>> ListCorrect = new ArrayList<>();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        int StartError = 0, EndError = 0, StartCorrect = 0, EndCorrect = 0;
        boolean CheckError = false, CheckCorrect = false;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                if (CheckError) {
                    EndError = i;
                }
                else {
                    if (CheckCorrect) {
                        CheckCorrect = false;
                        ListCorrect.add(new Pair<>(StartCorrect, EndCorrect));
                    }
                    StartError = i;
                    EndError = i;
                    CheckError = true;
                }
            }
            else {
                if (CheckCorrect) {
                    EndCorrect = i;
                }
                else {
                    if (CheckError) {
                        CheckError = false;
                        ListError.add(new Pair<>(StartError, EndError));
                    }
                    StartCorrect = i;
                    EndCorrect = i;
                    CheckCorrect = true;
                }
            }
        }
        if (CheckCorrect) {
            ListCorrect.add(new Pair<>(StartCorrect, EndCorrect));
        }
        else {
            ListError.add(new Pair<>(StartError, EndError));
        }
        System.out.print("Errors: ");
        for (int i = 0; i < ListError.size()-2; i++) {
            System.out.print(ListError.get(i) + ", ");
        }
        if (ListError.size() < 2) {
            System.out.println(ListError.get(0));
        }
        else {
            System.err.println(ListError.get(ListError.size() - 2) + " and " + ListError.get(ListError.size()-1));
        }
        System.out.print("Correct: ");
        for (int i = 0; i < ListCorrect.size()-2; i++) {
            System.out.print(ListCorrect.get(i) + ", ");
        }
        if (ListCorrect.size() < 2) {
            System.out.println(ListCorrect.get(0));
        }
        else {
            System.err.println(ListCorrect.get(ListCorrect.size() - 2) + " and " + ListCorrect.get(ListCorrect.size()-1));
        }
        sc.close();
    }
}
