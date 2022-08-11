import java.util.Scanner;
public class FurnitureItemImpl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FurnitureItem f1= new FurnitureItem();
        System.out.println("Enter furniture code");
        f1.furnitureCode=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter furniture Usage");
        f1.furnitureUsage=sc.nextLine();
        System.out.println("Enter furniture Type");
        f1.furnitureType=sc.nextLine();
        System.out.println("Enter furniture color");
        f1.color=sc.nextLine();
        System.out.println("Enter furniture Grade");
        f1.grade=sc.nextLine();
        System.out.println("Enter furniture price");
        f1.furniturePrice=sc.nextInt();
        double discountedPrice= f1.getDiscountedPrice(f1.furniturePrice);





        System.out.println("furniture code = " + f1.furnitureCode);
        System.out.println("furniture type = " + f1.furnitureType);
        System.out.println("furniture grade = " + f1.grade);
        System.out.println("furniture color = " + f1.color);
        System.out.println("furniture usage = " + f1.furnitureUsage);
        System.out.println("furniture price = " + f1.furniturePrice);
        System.out.println("discounted price = "+ discountedPrice);

    }
}

