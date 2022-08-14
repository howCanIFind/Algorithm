package programmers;

import java.util.*;

public class KAKAO_BLIND_RECRUITMENT_2019_실패율 {
    public static void main(String[] args) {

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};


        int[] solution = solution(N, stages);
        for (int i : solution) {
            System.out.println(i);
        }

    }

    public static int[] solution(int N, int[] stages) {

        Map<Integer, Double> failPercentage = new HashMap<>();
        int[] userFailCnts = new int[N+2];
        int[] userTotalCnts = new int[N+2];

        for (int stage : stages) {
            userFailCnts[stage]++;
            for (int i=1; i<=stage; i++) {
                userTotalCnts[i]++;
            }
        }

        for (int i=1; i<=N; i++) {
            if (userFailCnts[i] == 0 || userTotalCnts[i] == 0) {
                failPercentage.put(i, 0.0);
            } else {
                failPercentage.put(i, (double) userFailCnts[i] / userTotalCnts[i]);
            }
        }

        List<Integer> list = new ArrayList<>(failPercentage.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(failPercentage.get(o2), failPercentage.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

}
