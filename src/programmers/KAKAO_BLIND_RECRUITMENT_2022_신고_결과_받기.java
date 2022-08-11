package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;


public class KAKAO_BLIND_RECRUITMENT_2022_신고_결과_받기 {

    public static void main (String[]args){

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] solution = solution(id_list, report, k);
        for (int i : solution) {
            System.out.println(i);
        }

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
        HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        for (String s : reportSet) {
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];
            reporterInfoMap.putIfAbsent(reporter, new HashSet<String>(){{
                add(reported);
            }});
            reporterInfoMap.get(reporter).add(reported);
            reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0)+1);
        }

        for (String reported : reportedCountInfoMap.keySet()){
            int reportedCount = reportedCountInfoMap.get(reported);
            if(reportedCount >= k){
                for(int i=0; i<id_list.length; i++){
                    if(reporterInfoMap.containsKey(id_list[i]) && reporterInfoMap.get(id_list[i]).contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }
}
