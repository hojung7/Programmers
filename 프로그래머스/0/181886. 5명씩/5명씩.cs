using System;
using System.Collections.Generic;

public class Solution {
    public string[] solution(string[] names) {
        
        List<String> result = new List<String>();
        
        for (int i = 0; i< names.Length ; i += 5){
            result.Add(names[i]);
        }
        
        return result.ToArray();
    }
}