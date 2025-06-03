class Solution {
    public int differenceOfSums(int n, int m) {
        /*
         * @author Grace Hanson
         * 
         * @date 6-2-2025
         * 
         * @description This function calculates the difference between the sum of all
         * integers from 1 to n that are not divisible by m
         * and the sum of all integers from 1 to n that are divisible by m.
         */

        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1 - num2;
    }
}