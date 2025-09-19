import main.Tweet;
import main.Tweeter;

import java.time.LocalDate;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Tweeter<Tweet> tweeter = new Tweeter<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tweet Details in this format: subject,date,noOfViews,hashTags(comma separated)");
        System.out.println("For example: Hello World,2025-09-14,1000,#io,#Hello,#dfg");
        try {
            while (true) {
                try {
                    System.out.print("Enter tweet Details: ");
                    String ip = sc.nextLine();

                    if (ip.equalsIgnoreCase("EXIT")) break;

                    String[] parts = ip.split(",");
                    for (int i = 0; i < parts.length; i++) {
                        parts[i] = parts[i].trim();
                    }


                    String subject = parts[0];
                    LocalDate date = LocalDate.parse(parts[1]);
                    Long noOfViews = Long.parseLong(parts[2]);
                    Set<String> hashTags = Set.of(Arrays.copyOfRange(parts, 3, parts.length));
                    tweeter.addTweet(subject, date, noOfViews, hashTags);
                } catch (ArithmeticException e) {
                    System.err.println("Data Validation Error: " + e.getMessage());
                    e.printStackTrace();
                } catch (NullPointerException e) {
                    System.err.println("Data Integrity Error: " + e.getMessage());
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.err.println("Data Validation Error: " + e.getMessage());
                    e.printStackTrace();
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            System.out.println();
            System.out.println("All tweets: ");
            for (Tweet t : tweeter.getTweets()) {
                System.out.println(t);
            }
            System.out.println();

            System.out.println("All the tweets that are posted in current month");
            //1. List all the tweets that are posted in current month
            for (Tweet t : tweeter.getMonthTweets()) {
                System.out.println(t);
            }
            System.out.println();

            for (Tweet t : tweeter.getTweets()) {
                System.out.println(t);
            }
            System.out.println();


            //3. Count the tweets by Subject
            System.out.println("Count the tweets by Subject: ");
            for (Map.Entry<String, Long> entry : tweeter.countTweetsBySub().entrySet()) {
                System.out.print(entry.getKey() + ": " + entry.getValue());
                System.out.println();
            }
            System.out.println();

            //5. List the tweets that got more than 10k views
            System.out.println("List the tweets that got more than 10k views");
            for (Tweet t : tweeter.listMoreViewsTweets(10000)) {
                System.out.println(t);
            }
            System.out.println();

            //6. Print the top 5 trending tweets
            System.out.println("Print the top 5 trending tweets");
            for (Tweet t : tweeter.getTrendTweets(5)) {
                System.out.println(t);
            }
            System.out.println();

            //2. List all the tweets for a perticular hashtag
            System.out.print("Enter hashTag, you want search tweets for: ");
            String ip2 = sc.nextLine();
            for (Tweet t : tweeter.getHashTagTweets(ip2)) {
                System.out.println(t);
            }
            System.out.println();

        } finally {
            sc.close();
        }
    }

}
