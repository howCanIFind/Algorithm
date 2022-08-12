package programmers;

public class Greedy_체육복 {

    public static void main (String[]args){
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

//        solution(n, lost, reserve);
        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int havingPersonCount = 0;
        int[] people = new int[n];
        boolean[] checkList = new boolean[n];

        for (int i=0; i<n; i++) {
            people[i] = 1;
        }

        for (int lostIdx : lost) {
            people[lostIdx-1] -= 1;
        }
        for (int reserveIdx : reserve) {
            people[reserveIdx-1] += 1;
        }

        for (int i=0; i<n; i++) {
            if (i > 0 && people[i] == 0 && people[i-1] == 2) {
                people[i] += 1;
                people[i-1] -= 1;
            } else if(i<n-1 && people[i] == 0 && people[i+1] == 2){
                people[i] += 1;
                people[i+1] -= 1;
            }
        }

        for (int person : people) {
            if (person > 0) {
                havingPersonCount++;
            }
        }

        return havingPersonCount;
    }
}
