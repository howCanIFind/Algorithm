import java.util.Scanner;

public class findPrime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startNumber = in.nextInt();
        int endNumber = in.nextInt();


        int[] prime = new int[endNumber+1];

        for(int i=0; i<endNumber; i++) {
            prime[i] = i;
        }
        //소수 구하기
        for(int i=startNumber; i<endNumber; i++) {
            if(prime[i] == 0) continue;
            for(int j=2*i; j<=endNumber; j+=i) prime[j] = 0;
        }

        for(int i=startNumber; i< prime.length; i++)
            if(prime[i] != 0) System.out.println(prime[i]);

        in.close();
    }
}
