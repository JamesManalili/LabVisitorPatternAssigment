package VisitorPattern;
import java.util.HashMap;
import java.util.Map;

public class ShippingForSofa implements ShippingCost {
    private static Map<String, Double> sizeChart = new HashMap<>();
    static {
        sizeChart.put("small", 120.0);
        sizeChart.put("medium", 200.0);
        sizeChart.put("large", 300.0);
    }

    @Override
    public double calculate(double size, double distance) {
        String val = "";
        double additionalShipping = 0.0;

        if(size <=57.0){
            val = "small";
            additionalShipping = 10.0;
        }
        else if(size > 58.0 && size < 72.0){
            val = "medium";
            additionalShipping = 20.0;
        }
        else{
            val = "large";
            additionalShipping = 40.0;
        }

        return sizeChart.get(val)*distance + additionalShipping;
    }

}