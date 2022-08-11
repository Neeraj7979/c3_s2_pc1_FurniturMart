public class FurnitureItem {

    int furnitureCode;
    String furnitureType;
    String  grade;
    String color;
    String  furnitureUsage;
    double furniturePrice;

    FurnitureItem(){
        int furnitureCode=0;
        String furnitureType=null;
        String grade=null;
        String color=null;
        String furnitureUsage=null;
        double furniturePrice=0;
    }

    public double getDiscountedPrice(String furnitureUsage,double furniturePrice){
        if (furnitureUsage.equals("Outdoor")){
            return (furniturePrice * 95)/100;
        }
        else {
            return furniturePrice;
        }
    }
}

