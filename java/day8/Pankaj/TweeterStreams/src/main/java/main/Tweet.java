package main;

import java.time.LocalDate;
import java.util.Set;

//    Perform following operations for tweeter website
//    A tweet should have
//    a. subject
//    b. date of post
//    c. no of views
//    d. Set of hashtags (one tweet can have many hashtags e.g. #punerains,#flood,#weatherupdate)


public class Tweet {
    private String subject;
    private LocalDate date;
    private Long noOfViews;
    private Set<String> hashTags;

    Tweet(String subject, LocalDate date, Long noOfViews, Set<String> hashTags) {
        this.subject = subject;
        this.date = date;
        this.noOfViews = noOfViews;
        this.hashTags = hashTags;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getNoOfViews() {
        return noOfViews;
    }

    public void setNoOfViews(Long noOfViews) {
        this.noOfViews = noOfViews;
    }

    public Set<String> getHashTags() {
        return hashTags;
    }

    public void setHashTags(Set<String> hashTags) {
        this.hashTags = hashTags;
    }


    @Override
    public String toString() {
        return "subject='" + subject + '\'' +
                ", date=" + date +
                ", noOfViews=" + noOfViews +
                ", hashTags=" + hashTags;
    }
}
