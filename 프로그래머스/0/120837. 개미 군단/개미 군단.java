class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int max5 = hp / 5;
        int max3 = (hp % 5) / 3;
        int max1 = (hp % 5 % 3) / 1;
        
        answer = max5 + max3 + max1;
        
        return answer;
    }
}