package DessertOps;

import DessertTypes.Candy;
import DessertTypes.Cookie;
import DessertTypes.IceCream;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Cart cart = new Cart();
        while (true) {
            System.out.println("1: candy \n2: Cookie \n3: IceCream \n4: displaying bill and total items purchased\n5: for exit\n");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Candy candy = new Candy("mango");
                    cart.addToCart(candy, 10);
                    System.out.println("Candy added to the cart");
                    break;
                case 2:
                    Cookie cookie = new Cookie("tango");
                    cart.addToCart(cookie, 20);
                    System.out.println("Cookie added to the cart");
                    break;
                case 3:
                    IceCream iceCream = new IceCream("Sango");
                    cart.addToCart(iceCream, 30);
                    System.out.println("Ice Cream added to the cart");
                    break;
                case 4:
                    System.out.println("Total Items purchased:" + cart.displayTotalCount() + "\n");
                    System.out.println("Billed amount:" + cart.generateBill() + "\n");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please select any one option");

            }
            System.out.println("\n");
            if (option == 5) {
                break;
            }
        }

    }
}
