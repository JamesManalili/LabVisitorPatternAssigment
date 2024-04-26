package VisitorPattern;

public class Furniture implements FurnitureShipment {
    private String name;
    private String type;
    private Double size;
    public Furniture(String name, String type, double size){
        this.name = name;
        this.type=type;
        this.size=size;
    }

    @Override
    public double ship(ShippingCost calc, double distance) {
        return calc.calculate(size, distance);
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }


    public double getShippingCost(Furniture furniture, double distance){
        //creating shipment calculators
        ShippingCost calc = null;

        if ("Chair".equals(furniture.getType())) {
            calc = new ShippingForChair();
        } else if ("Table".equals(furniture.getType())) {
            calc = new ShippingForTable();
        } else if ("Sofa".equals(furniture.getType())) {
            calc = new ShippingForSofa();
        }

        return furniture.ship(calc, distance);
    }
}