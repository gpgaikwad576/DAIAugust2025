package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;

public class Tweeter<T extends Tweet> {
    private T[] tweets;
    public Tweeter(T[] tweets){
        this.tweets = tweets;
    }
//1. List all the tweets that are posted in current month
    public List<T> listMonthTweets(){
        List<T> rtweets = new ArrayList<T>();
        LocalDate today = LocalDate.now();
        for(T t: tweets){
            if(t.getDate().getMonth() == today.getMonth()){
                rtweets.add(t);
            }
        }
        return rtweets;
    }
//2. List all the tweets for a perticular hashtag
    public List<T> listHashTagTweet(String hashTag){
        List<T> rtweets = new ArrayList<T>();
        for( T t:tweets){
            if(t.getHashTags().contains(hashTag){
                rtweets.add(t);
            }

        }
        return rtweets;
    }
//3. Count the tweets by Subject
    public Map<String,Long> countTweetsSub(){
        Map<String,Long> rtweets = new HashMap<>();
        for(T t:tweets){
            if(!rtweets.containsKey(t.getSubject())){
                rtweets.put(t.getSubject(),(Long)1);
            }
        }
    }
//5. List the tweets that got more than 10k views
//6. Print the top 5 trending tweets

}
