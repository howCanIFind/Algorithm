package infrearnJavaAlgorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 회의실_배정 {
    static class Time implements Comparable<Time> {
        public int start, end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.end==o.end) return this.start - o.start;
            else return this.end-o.end;
        }
    }
    public static int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int endTime = 0;
        for (Time ob : arr) {
            if (ob.start>=endTime) {
                cnt++;
                endTime = ob.end;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(solution(arr, n));
    }
}
