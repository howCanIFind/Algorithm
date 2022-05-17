import java.util.Scanner;

public class Blackjack_2798 {

    public static int search(int numberOfCards, int max, int[] cardsArr) {
        int result = 0;

        for(int i=0; i<numberOfCards-2; i++) {
            for(int j=i+1; j<numberOfCards-1; j++) {
                for (int k=j+1; k<numberOfCards; k++) {
                    int sum = cardsArr[i] + cardsArr[j] + cardsArr[k];

                    if(max == sum) return sum;

                    if(result < sum && sum<max) result = sum;
                }
            }
        }
        return result;
    }

    // 완전 탐색 알고리즘
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfCards = scanner.nextInt();
        int max = scanner.nextInt();

        int[] cardsArr = new int[numberOfCards];
        for(int i=0; i<numberOfCards; i++) {
            cardsArr[i] = scanner.nextInt();
        }

        System.out.println(search(numberOfCards, max, cardsArr));


    }
}
