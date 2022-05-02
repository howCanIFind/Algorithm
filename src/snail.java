import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snail {

    public static int snailWantUp(int A, int B, int V) {

        int day = (V-B)/(A-B);

        if((V-B)%(A-B) != 0) day++;
        return day;
    }


    public static void main (String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        System.out.println(snailWantUp(A,B,V));

    }
}
