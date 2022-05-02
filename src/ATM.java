import java.util.Scanner;

public class ATM {

    public static void main (String[]args){

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        // 처음 입력된 수만큼 입력 받기.
        int[] PArr = new int[N];
        for(int i=0; i<N; i++) {
            PArr[i] = in.nextInt();
        }

        // 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구해야하므로
        // 오름차순 정렬이 필요. Arrays.sort(PArr)로 대체 가능.
        // 버블정렬
        int temp=0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N-i-1; j++) {
                if(PArr[j]>PArr[j+1]) {
                    temp = PArr[j];
                    PArr[j] = PArr[j+1];
                    PArr[j+1] = temp;
                }
            }
        }

        // 걸리는 시간을 모두 더해줌. 이 때 어떤 사람의 걸린 시간은 앞의 사람이 걸린
        // 시간에 자신이 걸릴 시간을 합한 값임.
        temp=0;
        for(int i=0; i<N; i++) {
            PArr[i] = PArr[i]+temp;
            temp = PArr[i];
        }
        int sum=0;
        for(int P:PArr) sum += P;
        System.out.println(sum);


        in.close();

    }
}
