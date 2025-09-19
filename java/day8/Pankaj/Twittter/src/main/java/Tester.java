import Main.Tweet;
import Main.Tweeter;
import java.time.LocalDate;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Tweeter<Tweet> tweeter = new Tweeter<>();
        Scanner sc = new Scanner(System.in);
        try{
        while (true) {
            String ip = sc.nextLine();
            if (ip.equalsIgnoreCase("EXIT")) break;

            String[] parts = ip.split(",");
            for (int i = 0; i < parts.length; i++) {
                parts[i] = parts[i].trim();
            }


            String subject = parts[0];
            LocalDate date = LocalDate.parse(parts[1]);
            int noOfViews = Integer.parseInt(parts[2]);


            Set<String> hashTags = new HashSet<>();
            if (parts.length > 3) {
                String[] tags = Arrays.copyOfRange(parts, 3, parts.length);
                for (String t : tags) {
                    t = t.trim();
                }
                hashTags.addAll(Arrays.asList(tags));
            }

            Tweet tweet = new Tweet(subject, date, noOfViews, hashTags);
            tweeter.addTweet(subject, date, noOfViews, hashTags);
        }
            System.out.println("These are tweets:");
            for (Tweet t : tweeter.getTweets()) {
                System.out.println(t);
            }
            System.out.println();

            System.out.println("Subject and count of tweets: ");
            for(Map.Entry<String,Long> entry: tweeter.countTweetsSub().entrySet()){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
            System.out.println();

            System.out.println("Trendy Tweets:");
            for (Tweet t : tweeter.getTrendTweets(5)) {
                System.out.println(t);
            }

            System.out.println();
            System.out.println("Tweets having more than 200 views:");
            for (Tweet t : tweeter.listMoreViewsTweets(200)) {
                System.out.println(t);
            }

            System.out.println();
            System.out.println("Tweets in the current month");
            for (Tweet t : tweeter.listMonthTweets()) {
                System.out.println(t);
            }

            System.out.println();
            System.out.println("enter hashtag to search: ");
            String ip2 = sc.nextLine();
            System.out.println("Tweets of the hashtag:");
            for (Tweet t : tweeter.listHashTagTweet(ip2)) {
                System.out.println(t);
            }
        }finally{
            sc.close();
            }

        }
    }

