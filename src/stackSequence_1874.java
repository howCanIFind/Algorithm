import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackSequence_1874 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N =Integer.parseInt(br.readLine());

        int last_value = 0;
        while (N -- > 0) {
            int value = Integer.parseInt(br.readLine());

            if(last_value < value) {
                for(int i=last_value+1; i<=value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                last_value = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}
