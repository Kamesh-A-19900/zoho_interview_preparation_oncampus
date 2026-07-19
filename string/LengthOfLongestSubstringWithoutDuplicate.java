package string;

// Given a string s, find the length of the longest substring without duplicate characters.
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Time complexity: O(N)
// Space complexity: O(256)

public class LengthOfLongestSubstringWithoutDuplicate {
    public static void main(String[] args) {
        String s = "abcdbcbdef";
        int[] hash = new int[256];
        int max_len = 0;
        int left = 0;
        for(int right = 0;right<s.length();right++){

            while(hash[s.charAt(right)]==1){
                hash[s.charAt(left)]=0;
                left++;
            }

            hash[s.charAt(right)] = 1;

            max_len = Math.max(max_len, right-left+1);
        }
        System.out.println(max_len);
    }    
}
