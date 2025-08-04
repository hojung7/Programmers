using System;
using System.Linq;

public class Solution {
    public int[] solution(int[] num_list, int n) {

        int[] after = num_list.Skip(n).ToArray(); // n번째 이후
        int[] before = num_list.Take(n).ToArray(); // n번까지
        
        return after.Concat(before).ToArray();
        }
    }
