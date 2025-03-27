

/**
*  @author Grace Hanson
 * @param {number} x
 * @return {boolean}
 * @date 3-27-2025
 * @brief validate a palindrome via converting to string and splitting
 */
var isPalindrome = function (x) {
    //covnert x to a string
    const original = x.toString();
    const reversed = original.split('').reverse().join('');
    return original === reversed;
};