import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
				//✅ 두 큐의 초기 합을 기록한다.
        long q1Sum = 0;
        long q2Sum = 0;
        Deque<Integer> q1 = new LinkedList<>();
        Deque<Integer> q2 = new LinkedList<>();

        for (int value : queue1) {
            q1.add(value);
            q1Sum += value;
        }

        for (int value : queue2) {
            q2.add(value);
            q2Sum += value;
        }

        if ((q1Sum + q2Sum) % 2 == 1) {
            return -1;
        }

				//✅ 3n동안 반복한다.
        for (int i = 0; i < 3 * n; i++) {
						//✅ 두 큐의 합이 같은 경우 정답을 반환한다.
            if (q1Sum == q2Sum) {
                return i;
						//✅ queue1의 합이 더 큰 경우
            } else if (q1Sum > q2Sum) {
								//✅ queue1의 원소를 pop한다.
                int value = q1.poll();
								//✅ pop된 원소를 queue2에 insert한다.
                q2.add(value);
								//✅ 해당 원소의 이동을 두 큐의 합에 각각 반영한다.
                q1Sum -= value;
                q2Sum += value;
						//✅ queue2의 합이 더 큰 경우
            } else {
								//✅ queue2의 원소를 pop한다.
                int value = q2.poll();
								//✅ pop된 원소를 queue1에 insert한다.
                q1.add(value);
								//✅ 해당 원소의 이동을 두 큐의 합에 각각 반영한다.
                q2Sum -= value;
                q1Sum += value;
            }
        }

				//✅ 3n의 반복동안 답을 구하지 못한 경우 -1을 반환한다.
        return -1;
    }
}