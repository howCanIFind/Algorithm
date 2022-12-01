package infrearnJavaAlgorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {

    // reverse 사용
    public static ArrayList<String> solution1(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    // 직접 뒤집기
    public static ArrayList<String> solution2(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }



    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = sc.next();
        }
        for (String x : solution1(str)) {
            System.out.println(x);
        }
    }
}
