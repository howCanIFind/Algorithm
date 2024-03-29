import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Balanced_world_4949 {

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == ']') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (ch == ')') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while (true) {
            s = br.readLine();

            if (s.equals(".")) {
                break;
            }

            sb.append(solve(s)).append('\n');
        }

        System.out.println(sb);
    }
}
