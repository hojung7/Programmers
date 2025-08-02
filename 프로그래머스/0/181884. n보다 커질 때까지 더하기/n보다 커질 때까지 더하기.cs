using System;

public class Solution {
    public int solution(int[] numbers, int n) {
        int sum  = 0;
        
        foreach(int num in numbers){           
            sum += num;            
            if(sum > n){                 
                return sum;
             }
        }
        
        // 누적액이 n보다 크지 않을 경우
        return sum;
    }
}