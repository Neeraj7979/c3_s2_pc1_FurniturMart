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

    public void getDiscountedPrice(){
        if (furnitureUsage.equals("Outdoor")){
           furniturePrice=(furniturePrice * 95/100);
            System.out.println("discounted furniture price :"+ furniturePrice);
        }
        else {
            System.out.println("No discount");
        }
    }


}

