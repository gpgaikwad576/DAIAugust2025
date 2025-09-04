package day5;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Toy chess = new Toy(101,"chess",250,"Board",new int[]{12,18},2021);
        Toy football = new Toy(102,"football",500,"Sports",new int[]{9,18},2022);
        Toy ludo = new Toy(103,"ludo",200,"Board",new int[]{8,15},2023);
        Toy doll = new Toy(104,"doll",300,"Girls",new int[]{2,8},2024);
        Toy drum = new Toy(105,"drum",400,"Boys",new int[]{2,8},2025);
        Toy cube = new Toy(106,"cube",130,"Puzzle",new int[]{12,18},2022);
        Toy car = new Toy(107,"car",250,"Sports",new int[]{5,12},2025);

        Stock stock = new Stock();

        stock.add(football);
        stock.add(chess);
        stock.add(car);
        stock.add(cube);
        stock.add(ludo);
        stock.add(drum);
        stock.add(doll);

        System.out.println("---List of Stocks---");
        stock.listStock();

        System.out.println("---Filter by Category----");
        System.out.println(stock.filterByCaterory("Sports"));

        System.out.println("---Binary Search by Product Id---");
        System.out.print("Write product id - ");
        int id = sc.nextInt();
        Collections.sort(stock.getToys());
        int result = Collections.binarySearch(stock.getToys(),new Toy(id,null,0,null,null,0));
        System.out.println(stock.getToyAtIndex(result));


        System.out.println("--------------------Toys between price range------------------");
        System.out.print("Write min price - ");
        int min = sc.nextInt();
        System.out.print("Write max price - ");
        int max = sc.nextInt();
        System.out.println(stock.toysInPriceRange(min,max));

        System.out.println("--------------------Toys by Age Group------------------");
        System.out.print("Write age of your child - ");
        int age = sc.nextInt();
        System.out.println(stock.toysForAge(age));

        System.out.println("--------------------Sort by Name------------------");
        Collections.sort(stock.getToys(),new NameComparator());
        stock.listStock();

        System.out.println("--------------------Sort by Price------------------");
        Collections.sort(stock.getToys(),new PriceComparator());
        stock.listStock();

        System.out.println("--------------------Older than Yead------------------");
        System.out.println(stock.toyOlderThanYear());

        System.out.println("-------------------Group by Category----------------");
        stock.groupByCategory();


    }

}
