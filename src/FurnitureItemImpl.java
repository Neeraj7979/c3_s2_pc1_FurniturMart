
public class FurnitureItemImpl {
    public static void main(String[] args) {

        FurnitureItem f1= new FurnitureItem();
        f1.furnitureCode=1234;
        f1.furnitureUsage="Outdoor";
        f1.furnitureType="Plastic";
        f1.color="red";
        f1.furniturePrice=f1.getDiscountedPrice(500);
        f1.grade="Grade 2";



        System.out.println("furniture code = " + f1.furnitureCode);
        System.out.println("furniture type = " + f1.furnitureType);
        System.out.println("furniture grade = " + f1.grade);
        System.out.println("furniture color = " + f1.color);
        System.out.println("furniture usage = " + f1.furnitureUsage);
        System.out.println("furniture price = " + f1.furniturePrice);

    }
}

