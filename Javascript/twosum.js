/** DESCRIPTION:
* Given an array of integers nums and an integer target, return indices
* of the two numbers such that they add up to target.
*
* You may assume that each input would have exactly one solution, and 
* you may not use the same element twice.
*
* You can return the answer in any order.
*/


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {

    //create a hashmap to store all values
    let numMap = new Map();

    //iterate through the array of numbers
    for (let i = 0; i < nums.length; i++) {
        //calculate the difference betwen the target and current num
        let complement = target - nums[i];

        //is complement already in the map?
        //if already in map, that means 2 numbers have been found
        if (numMap.has(complement)) {
            //if found return the indices of the complement and current #.
            return [numMap.get(complement), i];
        }
        //store current # with its index in the map otherwise
        numMap.set(nums[i], i);

    }
    //if no solution/numbers are found, return array empty
    return [];


};