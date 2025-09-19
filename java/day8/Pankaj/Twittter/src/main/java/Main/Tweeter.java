package Main;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Tweeter<T extends Tweet> {
    private List<T> tweets;
    public Tweeter(){
        this.tweets = new ArrayList<>();
    }

    public void addTweet(String subject, LocalDate date, int noOfViews, Set<String> hashTags){
        T tweet = (T)new Tweet(subject,date,noOfViews,hashTags);
        tweets.add(tweet);
    }

    public List<T> getTweets(){
        return tweets;
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
            if(t.getHashTags().contains(hashTag)){
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
                rtweets.put(t.getSubject(),1L);
            }
            else{
                rtweets.put(t.getSubject(),rtweets.get(t.getSubject()));
            }
        }
        return rtweets;
    }
//5. List the tweets that got more than 10k views
    public List<T> listMoreViewsTweets(int viewsMin){
        List<T> rtweets = new ArrayList<T>();
        for(T t: tweets){
            if(t.getNoOfViews() > viewsMin){
                rtweets.add(t);
            }
        }
        return rtweets;
    }
//6. Print the top 5 trending tweets
    public List<T> getTrendTweets(int topn){
        return tweets.stream().sorted((T t1,T t2)->Integer.compare(t2.getNoOfViews(),t1.getNoOfViews())).limit(topn).collect(Collectors.toList());

    }

}
