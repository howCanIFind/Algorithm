package infrearnJavaAlgorithm.HashMapAndHashTree;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char s : str1.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (char s : str2.toCharArray()) {
            if (!map.containsKey(s) || map.get(s)==0) return "NO";
            map.put(s, map.get(s) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
