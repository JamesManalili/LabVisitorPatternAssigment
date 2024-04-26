package VisitorPattern;

public class MainApp {
    public static void main(String[] args){
        Furniture furniture1 = new Furniture("Kitchen Chair","Chair", 19);
        Furniture furniture2 = new Furniture("Dining Table","Table", 72);
        Furniture furniture3 = new Furniture("Bedroom Table", "Table", 32);
        Furniture furniture4 = new Furniture("Lving Room Sofa", "Sofa", 76);
        Double furniture1Distance = 3.0;
        Double furniture2Distance = 10.0;
        Double furniture3Distance = 0.5;
        Double furniture4Distance = 9.0;

        System.out.println("The " + furniture1.getName()  + " is shipped and will travel "+ furniture1Distance +" kilometers." +
                "\nThe shipping fee will cost " + furniture1.getShippingCost(furniture1, furniture1Distance) +"PHP\n");

        System.out.println("The " + furniture2.getName()  + " is shipped and will travel "+ furniture2Distance +" kilometers." +
                "\nThe shipping fee will cost " + furniture2.getShippingCost(furniture2, furniture2Distance) +"PHP\n");

        System.out.println("The " + furniture3.getName()  + " is shipped and will travel "+ furniture3Distance +" kilometers." +
                "\nThe shipping fee will cost " + furniture3.getShippingCost(furniture3, furniture2Distance) +"PHP\n");

        System.out.println("The " + furniture4.getName()  + " is shipped and will travel "+ furniture4Distance +" kilometers." +
                "\nThe shipping fee will cost " + furniture4.getShippingCost(furniture4, furniture2Distance) +"PHP\n");
    }
}


