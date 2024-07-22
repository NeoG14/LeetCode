package org.solutions.Ej_3110_Score_of_a_string;

class Solution {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i=0; i<chars.length-1; i++){
            sum += Math.abs( (int)chars[i] - (int)chars[i+1] );
        }
        return sum;
    }
}
