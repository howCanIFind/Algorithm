package infrearnJavaAlgorithm.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호 {
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x=='(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
