class Solution {
    public int solution(int n, int k) {
        int price = n * 12000 + k * 2000;
        int cola = (int) (n / 10);
        int answer = price - (cola * 2000);
        return answer;
    }
}