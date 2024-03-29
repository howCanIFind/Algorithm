package infrearnJavaAlgorithm.dynamic;

import java.util.Scanner;

public class 돌다리_건너기 {
    static int[] dy;
    public static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i=3; i<=n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+2];
        System.out.println(solution(n));
    }
}
