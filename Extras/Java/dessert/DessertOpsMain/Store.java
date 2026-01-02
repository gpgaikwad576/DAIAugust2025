package DessertOpsMain;
import java.util.Scanner;

public class Store {
    public static void main(String[] args){
        Cart cart = new Cart();
        while(true) {
            System.out.println("1: candy \n2: Cookie \n3: IceCream \n4: displaying total count \n5: generating bill \n6: for exit\n");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch(option) {
                case 1:
                    Candy candy = new Candy("mango");
                    cart.addToCart(candy,10);
                    break;
                case 2:
                    Cookie cookie = new Cookie("tango");
                    cart.addToCart(cookie,20);
                    break;
                case 3:
                    IceCream iceCream= new IceCream("Sango");
                    cart.addToCart(iceCream,30);
                    break;
                case 4:
                    System.out.println("Total Items purchased:" + cart.displayTotalCount()+"\n");
                    break;
                case 5:
                    System.out.println("Total Items purchased:" + cart.generateBill()+"\n");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please select any one option");


            }
            if(option==6){break;}
        }

    }
}
