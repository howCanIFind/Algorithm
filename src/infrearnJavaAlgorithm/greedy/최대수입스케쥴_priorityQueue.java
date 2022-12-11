package infrearnJavaAlgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대수입스케쥴_priorityQueue {
    static class Lecture implements Comparable<Lecture> {
        public int money;
        public int time;

        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }
        @Override
        public int compareTo(Lecture o) {
            return o.time-this.time;
        }
    }
    static int n, max = Integer.MIN_VALUE;
    public static int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for (int i=max; i>=1; i--) {
            for (; j<n; j++) {
                if (arr.get(j).time<i) break;
                priorityQueue.offer(arr.get(j).money);
            }
            if (!priorityQueue.isEmpty()) answer += priorityQueue.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if (d>max) max = d;
        }
        System.out.println(solution(arr));
    }
}
