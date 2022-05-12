import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Rotating_queue_1021 {

    public static LinkedList<Integer> deque = new LinkedList<Integer>();
    int count=0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); // 큐의 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑으려는 숫자의 개수

        for(int i=1; i<=N; i++) {
            deque.offer(i);
        }

        int[] sequence = new int[M];

    }
}
