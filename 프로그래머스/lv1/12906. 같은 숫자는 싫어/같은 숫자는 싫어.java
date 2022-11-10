import java.util.*;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();

        int num = -1; //0~9

        al.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            num = al.get(al.size()-1);
            if (num != arr[i]) {
                al.add(arr[i]);
            }
        }

        int[] result = new int[al.size()];

        for (int i = 0; i < al.size() ; i++) {
            result[i] = al.get(i);
        }

        return result;
    }
}