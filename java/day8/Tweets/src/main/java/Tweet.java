import java.util.Set;
import java.sql.Date;

public class Tweet {
    private String subject;
    private Date date;
    private int views;
    private Set<String> hastags;

    public Tweet(String subject, Date date, int views, Set<String> hastags) {
        this.subject = subject;
        this.date = date;
        this.views = views;
        this.hastags = hastags;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    public int getViews() {
        return views;
    }

    public Set<String> getHastags() {
        return hastags;
    }

    public String toString(){
        return "Subject:"+this.subject+", date of post:"+this.date.toLocalDate().getDayOfMonth()+"/"+this.date.toLocalDate().getMonthValue()+"/"+this.date.toLocalDate().getYear()+", no of views:"+this.views+", hastags:"+this.hastags+"\n";
    }
}
