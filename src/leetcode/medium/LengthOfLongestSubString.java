package leetcode.medium;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        char[] characters = s.toCharArray();
        int start =0,end =0;
        int maxLenSubString = 0;

        while( end < characters.length )
        if( isWindowUnique(characters, start,end) ){
            end ++;
            maxLenSubString = Math.max( maxLenSubString, end-start );

        }else{
            start++;
        }
//        System.out.println(s.substring(start,end));
//        System.out.println(maxLenSubString);
    return maxLenSubString;
    }
    private boolean isWindowUnique(char[] characters, int start, int end){
        if(start == end) return true;
        HashMap<String,Integer> windowValueStore = new HashMap<>();
        while (start <= end){
            if(!windowValueStore.isEmpty() && windowValueStore.containsKey(String.valueOf(characters[start]))) return false;
            else windowValueStore.put(String.valueOf(characters[start]), 1);
            start ++;
        }
        return true;
    }


    //GFG solution
    public static int longestUniqueSubsttr(String str)
    {
        // if string length is 0
        if (str.length() == 0) return 0;
        // if string length 1
        if (str.length() == 1) return 1;
        // if string length is more than 2
        int maxLength = 0;
        boolean[] visited = new boolean[256];
        // left and right pointer of sliding window
        int left = 0, right = 0;
        while (right < str.length()) {
            if (visited[str.charAt(right)]) {
                while (visited[str.charAt(right)]) {
                    visited[str.charAt(left)] = false;
                    left++;
                }
            }
            visited[str.charAt(right)] = true;
            maxLength = Math.max(maxLength, (right - left + 1));
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().longestUniqueSubsttr("abcac"));
    }
}