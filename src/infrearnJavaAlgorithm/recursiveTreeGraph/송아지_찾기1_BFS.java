package infrearnJavaAlgorithm.recursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지_찾기1_BFS {
    int[] distance = {1, -1, 5};
    int [] check;
    Queue<Integer> queue = new LinkedList<>();
    public int BFS(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        queue.offer(s);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i=0; i<len; i++) {
                int x = queue.poll();
                for (int j=0; j<3; j++) {
                    int nx = x + distance[j];
                    if (nx == e) return level+1;
                    if (nx>=1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args) {
        송아지_찾기1_BFS T = new 송아지_찾기1_BFS();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
