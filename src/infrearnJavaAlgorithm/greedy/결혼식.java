package infrearnJavaAlgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 결혼식 {
    static class Time implements Comparable<Time> {
        public int time;
        public char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time==o.time) return this.state-o.state;
            else return this.time-o.time;
        }
    }
    public static int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for (Time ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int startTime = sc.nextInt();
            int endTime = sc.nextInt();
            arr.add(new Time(startTime, 's'));
            arr.add(new Time(endTime, 'e'));
        }
        System.out.println(solution(arr));
    }
}
