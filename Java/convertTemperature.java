class Solution {
    /*
     * @author Grace Hanson
     * @date 6-1-2025
     * @description This function converts a temperature from Celsius to Kelvin and Fahrenheit.
     * 
     */
    public double[] convertTemperature(double celsius) {
        double ans[] = new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;

        ans[0] = Kelvin;
        ans[1] = Fahrenheit;

        return ans;

    }
} 
    

