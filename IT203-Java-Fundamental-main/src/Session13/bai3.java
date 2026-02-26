package src.Session13;

import java.util.ArrayList;
import java.util.List;

public class bai3 {
    public static <T> List<T> findCommonPatients(List<T> A, List<T> B) {
        List<T> common = new ArrayList<>();
        for (T item : A) {
            if (B.contains(item)) {
                common.add(item);
            }
        }
        return common;
    }
    public static void main(String[] args) {
        List<Integer> A1 = new ArrayList<>();
        A1.add(101); A1.add(102); A1.add(105);
        List<Integer> B1 = new ArrayList<>();
        B1.add(102); B1.add(105); B1.add(108);
        System.out.println("Output: " + findCommonPatients(A1, B1));

        List<String> A2 = new ArrayList<>();
        A2.add("DN01"); A2.add("DN02"); A2.add("DN03");
        List<String> B2 = new ArrayList<>();
        B2.add("DN02"); B2.add("DN04");
        System.out.println("Output: " + findCommonPatients(A2, B2));
    }
}
