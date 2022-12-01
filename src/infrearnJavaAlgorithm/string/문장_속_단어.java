package infrearnJavaAlgorithm.string;

import java.util.Scanner;

public class 문장_속_단어 {

    // split 활용
    public static String solution1(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            if (x.length() > m) {
                m = x.length();
                answer = x;
            }
        }
        return answer;
    }

    // indexOf, substring 활용
    public static String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution2(str));

    }
}
