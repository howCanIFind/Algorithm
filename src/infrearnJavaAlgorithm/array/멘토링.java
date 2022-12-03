package infrearnJavaAlgorithm.array;

import java.util.Scanner;

public class 멘토링 {

    public static int solution(int n, int[][] arr) {
        int answer = 0;

        return answer;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
