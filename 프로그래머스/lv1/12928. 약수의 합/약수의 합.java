import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        List nums = new ArrayList<>();
        int sum = 0;
        if (n == 0) {
            return sum;
        }
        for (int i = 1; i < 3000; i++) {
            if (n % i == 0) {
                nums.add(i); //i가 약수
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            sum += (int) nums.get(i);
        }

        return sum;
    }
}