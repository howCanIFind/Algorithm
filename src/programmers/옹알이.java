package programmers;

public class 옹알이 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/120956
    public static void main (String[]args){
        String[] input1 = {"aya", "yee", "u", "maa"};
        String[] input2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        System.out.println("solution(input1) = " + solution(input1));
        System.out.println("solution(input2) = " + solution(input2));
    }


    public static int solution(String[] babbling) {

        int answer = 0;

        String[] speakingList = {"aya", "ye", "woo", "ma"};
        String[] banList = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String str : babbling) {
            for (String banStr : banList) {
                str = str.replace(banStr, "z");
            }
            for (String speakingStr : speakingList) {
                str = str.replace(speakingStr, "");
            }
            if (str.length() == 0) {
                answer ++;
            }
        }

        return answer;
    }

    // 다른사람풀이
    public int solution_def(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }
            String result = s.replaceAll("aya", "").replaceAll("ye", "").replaceAll("woo", "").replaceAll("ma", "");

            if (result.length() == 0) {
                answer ++;
            }
        }
        return answer;
    }

}