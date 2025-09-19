package main;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Tweeter<T extends Tweet> {
    private List<T> tweets;

    public Tweeter() {
        tweets = new ArrayList<T>();
    }


    public List<T> getTweets() {
        return tweets;
    }

    public void addTweet(String subject, LocalDate date, Long noOfViews, Set<String> hashTags) {
        T t = (T) new Tweet(subject, date, noOfViews, hashTags);
        tweets.add(t);
    }

    //1. List all the tweets that are posted in current month
    public List<T> getMonthTweets() {
        List<String> rtweets = new ArrayList<>();
        for(T t: tweets){
            rtweets.add(t.getDate().getMonth()+" "+LocalDate.now().getMonth()+" "+t.getDate().getMonth().equals(LocalDate.now().getMonth()));
            System.out.println();
        }
        return tweets.stream().filter((T t) -> t.getDate().getMonth().equals(LocalDate.now().getMonth())).collect(Collectors.toList());
    }

    //2. List all the tweets for a perticular hashtag
    public List<T> getHashTagTweets(String hashTag) {
        return tweets.stream().filter((T t) -> t.getHashTags().contains(hashTag)).toList();
    }

    //3. Count the tweets by Subject
    public Map<String, Long> countTweetsBySub() {
        return tweets.stream().collect(Collectors.groupingBy(T::getSubject, Collectors.counting()));
    }

    //5. List the tweets that got more than 10k views
    public List<T> listMoreViewsTweets(int minViews) {
        return tweets.stream().filter((T t) -> t.getNoOfViews() > minViews).collect(Collectors.toList());
    }

    //6. Print the top 5 trending tweets
    public List<T> getTrendTweets(long topn) {
        return tweets.stream().sorted(Comparator.comparing(T::getNoOfViews, Comparator.reverseOrder())).distinct().limit(topn).collect(Collectors.toList());
        //return tweets.stream().sorted((T t, T t2)->t2.getNoOfViews().compareTo(t.getNoOfViews()));
    }
}
