class Solution {
    public int solution(int n, int k) {
       
        int s = n / 10;
        int price = n * 12000 + k * 2000 - s * 2000;
        return price;
    }
}