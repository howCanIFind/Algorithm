package infrearnJavaAlgorithm.greedy;

import java.util.*;

public class 다익스트라_알고리즘 {

    static int n, m, a, b, c;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    static class Edge implements Comparable<Edge>{
        public int vex;
        public int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost=o.cost;
        }
    }

    public static void solution(int v) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(v, 0));
        dis[v] = 0;
        while (!priorityQueue.isEmpty()) {
            Edge tmp = priorityQueue.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost>dis[now]) continue;
            for (Edge ob : graph.get(now)) {
                dis[ob.vex] = nowCost + ob.cost;
                priorityQueue.offer(new Edge(ob.vex, nowCost + ob.cost));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(1);
        for (int i=2; i<=n; i++) {
            if (dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : " + dis[i]);
        }

    }
}
