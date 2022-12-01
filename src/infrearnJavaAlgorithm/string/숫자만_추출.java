package infrearnJavaAlgorithm.string;

import java.util.Scanner;

public class 숫자만_추출 {

    // 아스키 넘버 사용
    public static int solution1(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }

    // isDigit, parseInt 사용
    public static int solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution1(str));
    }

}
