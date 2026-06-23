package Week1.FinancialForcasting;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecaster {
    public static double forecastNaive(int n, double v0, double v1, double w1, double w2) {
        if (n == 0) return v0;
        if (n == 1) return v1;
        return (w1 * forecastNaive(n - 1, v0, v1, w1, w2)) + 
               (w2 * forecastNaive(n - 2, v0, v1, w1, w2));
    }
    public static double forecastOptimized(int n, double v0, double v1, double w1, double w2, Map<Integer, Double> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 0) return v0;
        if (n == 1) return v1;
        double result = (w1 * forecastOptimized(n - 1, v0, v1, w1, w2, memo)) + 
                        (w2 * forecastOptimized(n - 2, v0, v1, w1, w2, memo));
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        double v0 = 1000.0;
        double v1 = 1100.0;
        double w1 = 0.7;
        double w2 = 0.4;
        double naiveForecast = forecastNaive(5, v0, v1, w1, w2);
        System.out.println("Naive Forecast (Year 5): " + naiveForecast);
        Map<Integer, Double> cache = new HashMap<>();
        double optimizedForecast = forecastOptimized(100, v0, v1, w1, w2, cache);
        System.out.println("Optimized Forecast (Year 100): " + optimizedForecast);
    }
}