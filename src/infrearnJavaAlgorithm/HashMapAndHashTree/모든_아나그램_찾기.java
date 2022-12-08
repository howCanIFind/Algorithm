package infrearnJavaAlgorithm.HashMapAndHashTree;

import java.util.HashMap;
import java.util.Scanner;

public class 모든_아나그램_찾기 {
    public static int solution(String str1, String str2) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : str2.toCharArray()) map2.put(x, map2.getOrDefault(x, 0) + 1);
        int L = str2.length() - 1;
        for (int i=0; i<L; i++) map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        int lt = 0;
        for (int rt=L; rt<str1.length(); rt++) {
            map1.put(str1.charAt(rt), map2.getOrDefault(str1.charAt(rt), 0) + 1);
            if (map1.equals(map2)) answer++;
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
            if (map1.get(str1.charAt(lt)) == 0) map2.remove(str1.charAt(lt));
            lt++;
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
