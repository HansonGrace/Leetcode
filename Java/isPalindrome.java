
/*
* @author Grace Hanson
* @brief Given an integer x, return true if x is a palindrome, and false otherwise.
* @date 3-27-2025
*/
class Solution {
    public boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);

    }
}