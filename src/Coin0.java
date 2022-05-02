import java.util.Scanner;

public class Coin0 {

    public static void main (String[]args){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // 동전 종류 갯수.
        int cash = in.nextInt();    // 총 금액.
        int[] coinArr = new int[N];

        // 동전 종류 받기
        for(int i=0; i<N; i++) {
            coinArr[i] = in.nextInt();
        }

        int coinCnt=0;
        for(int i=N-1; i>=0; i--) {
            if(cash >= coinArr[i]) {
                coinCnt += cash/coinArr[i];
                cash = cash%coinArr[i];
            }
        }

        System.out.println(coinCnt);
        in.close();



    }
    // 왜 안될까?
//    int coinCnt=0;
//        for(int i=N-1; i>=0; i--) {
//        if(cash < coinArr[i]) continue;
//        coinCnt += cash/coinArr[i];
//        cash = cash%coinArr[i];
//        System.out.println(cash);
//    }
}
