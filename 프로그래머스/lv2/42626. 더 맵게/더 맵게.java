import java.util.PriorityQueue;

class Solution {
   public static int solution(int[] sco, int k) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < sco.length; i++) {
            pq.add(sco[i]);
        }

        while (pq.size() >= 2 && pq.peek() < k) {
            int mix = pq.poll() + (pq.poll() * 2);
            pq.add(mix);
            answer++;
        }
       
       if(pq.peek() < k) return -1;

        return answer;
    }
}