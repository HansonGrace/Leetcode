class Solution {
    /*
     * @author Grace Hanson
     * @date 6-2-2025
     * @description This function adds the digits of a number until a single digit is obtained.
     * It uses the digital root theory to achieve this in constant time.
     */
    public int addDigits(int num) {

        if(num == 0){
            return 0;
        } else{
            //use digital root theory
            return (num - 1 ) % 9 + 1;
        }
    }
}