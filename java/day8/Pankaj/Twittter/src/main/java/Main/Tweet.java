package Main;
import java.time.LocalDate;
import java.util.Set;

public class Tweet {
    private String subject;
    private LocalDate date;
    private int noOfViews;
    private Set<String> hashTags;

    public Tweet(String subject, LocalDate date, int noOfViews, Set<String> hashTags) {
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

    public int getNoOfViews() {
        return noOfViews;
    }

    public void setNoOfViews(int noOfViews) {
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
        return "Tweet{" +
                "subject='" + subject + '\'' +
                ", date='" + date + '\'' +
                ", noOfViews=" + noOfViews +
                ", hashTags=" + hashTags +
                '}';
    }

}
