
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int answer = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] >= answer) {
                    answer = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                    //4, 6으로 출력되는데 배열에서는 arr[5][7]에 있으므로 +1 해줘야함.
                }
            }
        }

        System.out.println(answer);
        System.out.printf("%d %d", x, y);

    }
}
