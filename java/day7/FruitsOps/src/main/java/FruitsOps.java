
import java.util.*;
import java.util.stream.Collectors;

public class FruitsOps {
    List<String> bucket;

    public FruitsOps(List<String> arr){
        bucket=arr;
    }
    public List<String> toUpper(){
        return bucket.stream().map(String::toUpperCase).collect(Collectors.toList());
    }


    public List<String> toLower(){
        return bucket.stream().map((p)->p.toLowerCase()).collect(Collectors.toList());
    }

    public List<String> filterBynAsc(int n){
        return bucket.stream().filter((p)->(int) p.charAt(0)<n).sorted().collect(Collectors.toList());
    }

    public List<String> filterBynDsc(int n){
        return bucket.stream().filter(p->(int) p.charAt(0)<n).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<String> filterByUpper(){
        return bucket.stream().filter(p->p.equals(p.toUpperCase())).collect(Collectors.toList());
    }

    public List<String> filterBySize(){
        return bucket.stream().filter(p->p.length()==6).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<String> sortByLength(){
        return bucket.stream().sorted((word1,word2)-> Integer.compare(word1.length(),word2.length())).collect(Collectors.toList());
    }
}