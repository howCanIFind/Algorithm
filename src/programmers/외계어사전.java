package programmers;

public class 외계어사전 {
    public static void main (String[]args){

        int answer1 = solution(new String[]{"p", "o","s"}, new String[]{"sod", "eocd", "qixm", "soo"});

    }


    public static int solution(String[] spells, String[] dic) {
        int answer = 2;

        for (String str : dic) {
            if (str.length() < spells.length) {
                continue;
            }

            boolean isCollect = true;
            for (String spell: spells) {
                if (str.indexOf(spell) == -1) {
                    isCollect = false;
                    break;
                }
            }
            if (isCollect == true) {
                answer = 1;
            }
        }

        return answer;
    }
}
