package programmers;

public class KAKAO_BLIND_RECRUITMENT_2018_비밀지도 {

    public static void main (String[]args){

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        solution(n, arr1, arr2);
    }


    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[5];
        int[][] map = new int[n][n];

        for (int i=0; i<n; i++) {
            StringBuilder mapLine = new StringBuilder();
            String str1 = getBinary(n, arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);

            for (int j=0;j<n; j++) {
                if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
                    mapLine.append("#");
                } else {
                    mapLine.append(" ");
                }
                answer[i] = String.valueOf(mapLine);
            }
        }
        return answer;
    }

    private static String getBinary(int n, int num) {
        StringBuilder str = new StringBuilder(Integer.toBinaryString(num));
        int len = str.length();
        for (int i=0; i<n-len; i++) {
            str.insert(0, "0");
        }
        return str.toString();
    }
}
