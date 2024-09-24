class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int maxCoffee = money / 5500;
        int change = money - maxCoffee * 5500;
        
        answer[0] = maxCoffee;
        answer[1] = change;
        
        return answer;
    }
}