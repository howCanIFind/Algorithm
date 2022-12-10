package infrearnJavaAlgorithm.HashMapAndHashTree;

import java.util.HashMap;
import java.util.Scanner;

public class K번째_큰_수 {
    public static int solution(int[] arr, int n, int k) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, n, k));
    }
}
