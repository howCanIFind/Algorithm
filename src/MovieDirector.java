import java.util.Scanner;

public class MovieDirector {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int count = 0;
        int number = 0;
        while(count < N) {

            number++;

            if(String.valueOf(number).contains("666")) {
                count++;
            }
        }
        System.out.println(number);
    }
}
