import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxHeap {


    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            if(num == 0) {
                if(maxHeap.isEmpty())
                    System.out.println(0);
                else System.out.println(maxHeap.poll()); // 첫번째 값 반환
            } else {
                maxHeap.add(num); // 값 추가
            }
        }

        scanner.close();
    }
}
