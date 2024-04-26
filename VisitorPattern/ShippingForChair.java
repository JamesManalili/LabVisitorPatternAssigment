package VisitorPattern;
import java.util.HashMap;
import java.util.Map;

public class ShippingForChair implements ShippingCost {
    private static Map<String, Double> sizes = new HashMap<>();
    static {
        sizes.put("small", 30.0);
        sizes.put("medium", 40.0);
        sizes.put("large", 50.0);
    }

    @Override
    public double calculate(double size, double distance) {
        String val = "";

        if(size <=18.0){
            val = "small";
        }
        else if(size > 18.0 && size < 24.0){
            val = "medium";
        }
        else{
            val = "large";
        }

        return sizes.get(val);
    }

}
