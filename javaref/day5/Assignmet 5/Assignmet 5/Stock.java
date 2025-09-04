package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Stock {

    private List<Toy> toys;

    public Toy getToyAtIndex(int i){
        return toys.get(i);
    }

    public Stock() {
        this.toys = new ArrayList<>();
    }

    public void add(Toy toy){
        toys.add(toy);
    }

    public void listStock(){
        for(Toy toy :toys)
            System.out.println(toy);
    }

    public List<Toy> filterByCaterory(String category){

        List<Toy> toyByCategory = new ArrayList<>();

        for(Toy toy : toys){
            if(toy.getCategory() == category) {
                toyByCategory.add(toy);
            }
        }
        return  toyByCategory;
    }

    public List<Toy> toysInPriceRange(int min, int max){
        List<Toy> toysInPriceRange = new ArrayList<>();

        for(Toy toy : toys){
            if(toy.getPrice()>=min && toy.getPrice()<=max) {
                toysInPriceRange.add(toy);
            }
        }
        return  toysInPriceRange;
    }

    public List<Toy> toysForAge(int age){
        List<Toy> toysForAge = new ArrayList<>();

        for(Toy toy : toys){
            if(toy.getAge()[0]<=age && toy.getAge()[1]>=age) {
                toysForAge.add(toy);
            }
        }
        return  toysForAge;
    }

    public List<Toy> toyOlderThanYear(){
        List<Toy> oldToys = new ArrayList<>();
        for(Toy toy: toys){
            if(toy.getPurchaseYear()<=2024){
                oldToys.add(toy);
            }
        }
        return oldToys;
    }


    public void groupByCategory(){
        Map<String,List<Toy>> map = new TreeMap<>();
        for(Toy toy:toys){
            map.put(toy.getCategory(),this.filterByCaterory(toy.getCategory()));
        }
        System.out.println(map);
    }

    public List<Toy> getToys() {
        return toys;
    }

}
