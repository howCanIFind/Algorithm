package infrearnJavaAlgorithm.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬나라_아일랜드_BFS {
    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int n, answer=0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> queue = new LinkedList<>();

    public static void BFS(int x, int y, int[][] board) {
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point pos = queue.poll();
            for (int i=0; i<8; i++) {
                int nx = x +dx[i];
                int ny = y + dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
                    board[nx][ny]=0;
                    BFS(nx, ny, board);
                }
            }
        }
    }
    public static void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j]=0;
                    BFS(i, j, board);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr);
        System.out.println(answer);
    }
}
