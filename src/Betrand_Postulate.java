import java.util.Scanner;

public class Betrand_Postulate {

    public static int betrand(int num) {

        if(num == 1) return 1;

        System.out.println("여기 완료");
        int answer = 0;
        int numcnt = 2 * num - num;
        int[] isPrime = new int[numcnt + 1];

        int cnt = num;
        for (int i = 0; i < isPrime.length; i++) {

            isPrime[i] = cnt++;
        }
        System.out.println("여기 완료2");
        for (int i = 0; i < num; i++) {
            if (isPrime[i] == 0) continue; //소수가 아니라면 continue
            for (int j = 2 * i; j <= num; j += i) isPrime[j] = 0; //소수의 배수는 소수를 약수로 가지므로 제외
        }


        System.out.println("여기 완료3");
        //소수 개수 구하기
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] != 0) answer++;
        }
        return answer;
    }


        public static void main (String[]args){

            Scanner in = new Scanner(System.in);
            int A = in.nextInt();

            System.out.println(betrand(A));

            in.close();
        }
    }
