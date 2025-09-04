import java.util.ArrayList;
import java.util.List;


class Numberops {
//    public static  boolean checkPositive(Predicate fun,int n){
//        return fun.test(n);
//    }
//
//    public static boolean checkprime(Predicate fun,int n){
//
//        return fun.test(n);
//    }

    public static List<Integer> operateOnNumbers(Predicate p, List<Integer> numbers) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (p.test(num)) {
                filteredNumbers.add(num);
            }
        }
        return filteredNumbers;
    }
}

public class Main {
    public static void main(String[] args) {
       Predicate num =(p->{if (p<0){return false;} else {return true;}});

        Predicate isprime=p->{
            if(p==2){
                return true;
            }
            for(int i=3;i<p;i++){
                if(p%i==0){
                    return false;
                }
            }
            return true;
        };

        List<Integer> arr=List.of(1,2,4,5,7,7,10,12,30);


        System.out.println(" ");
        System.out.print("IsPosotive: ");
        System.out.println(num.test(-3));
        System.out.println(" ");
        System.out.print("Isprime: ");
        System.out.println(isprime.test(10));

        System.out.println(" ");
        System.out.println("Even numbers: ");
        List<Integer> filterednumbyeven=Numberops.operateOnNumbers(n -> n % 2 == 0, arr);
        filterednumbyeven.stream().forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Divisible by 2,3,5 numbers: ");
        List<Integer> filterednumbyodd=Numberops.operateOnNumbers(n -> n % 2 == 0 && n%3==0 && n%5==0, arr);
        filterednumbyodd.stream().forEach(System.out::println);

    }


}
