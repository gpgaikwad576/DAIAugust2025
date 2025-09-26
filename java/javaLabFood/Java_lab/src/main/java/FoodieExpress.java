import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodieExpress {

    List<FoodItem> items = new ArrayList<>();


    public void addItem(String name, String category, int price, int stock, LocalDate ld, int discountp){

        items.add(new FoodItem(name, category, price, stock, ld, discountp));
    }

    public void displayItems(){
        items.forEach(System.out::println);
    }

    public void purchaseItem(LocalDate ld, int id) throws IDNotFoundException{
        boolean idfound = false;
        for(FoodItem f : items){
                if(f.getFood_ID()==id){
                    f.setLastOrderedDate(ld);
                    int stock1 = f.getStock();
                    f.setStock(stock1--);
                    idfound = true;

                }
            }
        if(!idfound){
            throw new IDNotFoundException("Id not found");
        }
    }

    public void updateStock(int id, int qty){
        for(FoodItem f:items){
            if(f.getFood_ID()==id){
                f.setStock(qty);
            }
        }

    }

    public void addDiscount(){
        for(FoodItem f : items){
            if(Math.abs(Period.between(f.getLastOrderedDate(),LocalDate.now()).toTotalMonths())>1){
                int discount = 15 ;
                f.setDiscountp(discount);
                System.out.println("Successful");
            }
        }
    }



    public void removeItems(){
        items.removeIf(f -> Math.abs(Period.between(f.getAddedDate(), LocalDate.now()).toTotalMonths()) > 6 && f.getLastOrderedDate() == null);
    }





    public static void main(String[] args) {
        FoodieExpress fe = new FoodieExpress();

        while(true){

            System.out.println("Enter one of listed options to perform a task ");
            System.out.println("1- Add an item 2- Purchase item 3- Update stock 4- Apply Discount 5- remove items 6-display list of items" +
                    " 7- see options again 8- Exit ");
            Scanner scn = new Scanner(System.in);
            int option = scn.nextInt();


            switch(option){
                case 1:
                    System.out.println("Enter name, category(VEG,NON_VEG,VEGAN) , price, stock, listing date(year, month, date) discount % ");
                    String name = scn.next();
                    String category = scn.next();
                    int price = scn.nextInt();
                    int stock = scn.nextInt();
                    int year = scn.nextInt();
                    int month = scn.nextInt();
                    int day = scn.nextInt();
                    LocalDate ld = LocalDate.of(year, month, day);
                    int disc = scn.nextInt();
                    fe.addItem(name, category,price, stock,ld, disc);


                    break;

                case 2:
                    System.out.println("Enter Purchase Date(year, month, date) and foodID:");
                    int year1=scn.nextInt();
                    int month1=scn.nextInt();
                    int day1=scn.nextInt();
                    LocalDate ld1 = LocalDate.of(year1, month1, day1);

                    int id1 = scn.nextInt();
                    try{
                        fe.purchaseItem(ld1, id1);

                    }
                    catch (IDNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break ;


                case 3:
                    System.out.println("enter quantity and ID to Update Stock");
                    int qty = scn.nextInt();
                    int id2 = scn.nextInt();
                    fe.updateStock(id2, qty);

                    break;

                case 4:
                    System.out.println("apply a 15% added discount not ordered in the last 30 days");
                    fe.addDiscount();
                    break;


                case 5:
                    System.out.println("remove food items added more than 6 months ago but never ordered");
                    fe.removeItems();
                    break;

                case 6:
                    System.out.println("Display all food items list");
                    fe.displayItems();
                    break;

                case 7:
                    System.out.println("ok! presenting options");
                    break;

                case 8:
                    System.out.println("Exiting");
                    System.exit(0);

                default:
                    System.out.println("invalid option");
                    break;
            }

        }
    }
}
