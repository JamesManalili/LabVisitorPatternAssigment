package VisitorPattern;
import java.util.HashMap;
import java.util.Map;

public class ShippingForTable implements ShippingCost {
    private static Map<String, Double> sizes = new HashMap<>();
    static {
        sizes.put("small", 50.0);
        sizes.put("medium", 70.0);
        sizes.put("large", 90.0);
    }

    @Override
    public double calculate(double size, double distance) {
        String val = "";

        if(size <=36.0){
            val = "small";
        }
        else if(size > 37.0 && size < 50.0){
            val = "medium";
        }
        else{
            val = "large";
        }

        return sizes.get(val)* distance;
    }

}

