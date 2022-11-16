
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 잘못된 수는 0으로 삭제 (lifo)
        // 스택에 있는 모든 데이터의 합
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력받을 정수의 개수
        int result = 0;

        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt(); //반복문 돌 때마다 입력받음

            if (data == 0) {
                s.pop();
            } else {
                s.add(data);
            }
        }

        while(s.size() != 0){
            result += s.pop();
        }

        System.out.println(result);
    }
}

