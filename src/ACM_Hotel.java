import java.util.Scanner;

public class ACM_Hotel {
    public static int findRoom(int height, int width, int number) {
        int roomNumber = 0;
        int floor = number%height;
        int room = number/height;

        if(floor == 0) {
            roomNumber = height*100 + room;
        }
        else {

            roomNumber = floor*100 + room+1;
        }
        return roomNumber;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int repetition = in.nextInt();
        for(int i=0; i<repetition; i++) {
            int height = in.nextInt();
            int width = in.nextInt();
            int number = in.nextInt();
            System.out.println(findRoom(height, width, number));

        }

        in.close();
    }
}
