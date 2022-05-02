import java.util.Scanner;

public class Fly_me_to_the_Alpha_Centauri {

    public static int minimum(int startPoint, int endPoint) {
        int distance = endPoint - startPoint;
        int max =(int)Math.sqrt(distance);

        if(max == Math.sqrt(distance)) {return 2*max - 1;}
        else if(distance <= max * max + max) {
            return 2 * max;
        } else {
            return 2 * max + 1;
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i=0; i< count; i++) {
            int startPoint = in.nextInt();
            int endPoint = in.nextInt();

            System.out.println(minimum(startPoint, endPoint));
        }

        in.close();
    }
}
