package infrearnJavaAlgorithm.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    public static String solution(String need, String plan) {
        Queue<Character> queue = new LinkedList<>();
        for (char x : need.toCharArray()) queue.offer(x);
        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) return "NO";
            }
        }
        if (!queue.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a, b));
    }
}
