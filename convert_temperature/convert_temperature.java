class Solution {
     public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15, fahrenheit = celsius * 1.80 + 32.00;
        double[] ans = {kelvin, fahrenheit};
        return ans;
    }
}