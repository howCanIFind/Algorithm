import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue_18258 {

    public static int[] queue = new int[20000];
    public static int size = 0;
    public static int front = 0;
    public static int back = 0;

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        while (N-->0) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken())); break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
                    break;
            }
        }

    }

    public static void push(int X) {
        queue[back] = X;
        size++;
        back++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }
        int result = queue[front];
        front++;
        size--;
        return result;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) return 1;
        else return -1;
    }

    public static int front() {
        if(size == 0) return -1;
        else return queue[front];
    }

    public static int back() {
        if(size == 0) return -1;
        else return queue[back-1];
    }
}
