class Solution {
    public int solution(int num1, int num2) {
        double a = (double) num1 / num2;
        int b = (int) (a * 1000);
        return b;
    }
}