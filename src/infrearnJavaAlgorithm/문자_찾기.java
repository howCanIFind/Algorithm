package infrearnJavaAlgorithm;

import java.util.Scanner;

public class 문자_찾기 {

    public static int solution(String str, char t) {
        int answer=0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char c : str.toCharArray()) {
            if (c == t) answer++;
        }
        return answer;
    }

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str, c));

    }
}


//    public static void solution(String str, char t) {
//        int answer=0;
//    }
//
//    public static void main (String[]args){
//
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//    }
