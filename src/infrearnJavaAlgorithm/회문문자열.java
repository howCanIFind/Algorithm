package infrearnJavaAlgorithm;

import java.util.Scanner;

public class 회문문자열 {

    // toUpperCase() 사용
    public static String solution1(String str) {
        str = str.toUpperCase();
        int len = str.length();
        for (int i =0; i<len/2; i++) {
            if (str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return "YES";
    }

    public static String solution2(String str) {
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) return "YES";
        return "NO";
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution1(str));
    }
}
