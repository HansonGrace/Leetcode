import java.util.HashMap;
import java.util.Map;

//Completed 4-14-2025 Grace Hanson
class romanNumeralToInteger {
    public int romanToInt(String s) {

        // Hashmap dictionary to hold numerals and their numbers together
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        // Loops through the string to find the inputted Roman numeral
        for (int i = 0; i < s.length(); i++) {
            // If the current value is less than the next value, subtract it
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                // Otherwise add the current value to the result
                result += map.get(s.charAt(i));
            }
        }

        return result; // Return the final integer value
    }
}
