package Main;

import java.time.LocalDate;

public class Movie {
    private static long id = 1;
    private String title;
    Genre genre;
    int relYear;
    LocalDate addedDate;
    boolean availabilitytatus;
    long price;
    int discount = 0;
    LocalDate lastWatchedDate;

    public Movie(String title, Genre genre, int relYear, LocalDate addedDate, boolean availabilitytatus, long price, int discount, LocalDate lastWatchedDate) {
        this.id = this.id + 1;
        this.title = title;
        this.genre = genre;
        this.relYear = relYear;
        this.addedDate = addedDate;
        this.availabilitytatus = availabilitytatus;
        this.price = price;
        this.discount = discount;
        this.lastWatchedDate = lastWatchedDate;
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getRelYear() {
        return relYear;
    }

    public void setRelYear(int relYear) {
        this.relYear = relYear;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public boolean getAvailabilitytatus() {
        return availabilitytatus;
    }

    public void changeAvailabilitytatus() {

        if (this.availabilitytatus) this.availabilitytatus = false;
        else this.availabilitytatus = true;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDate getLastWatchedDate() {
        return lastWatchedDate;
    }

    public void setLastWatchedDate(LocalDate lastWatchedDate) {
        this.lastWatchedDate = lastWatchedDate;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", relYear=" + relYear +
                ", addedDate=" + addedDate +
                ", availabilitytatus=" + availabilitytatus +
                ", price=" + price +
                ", discount=" + discount +
                ", lastWatchedDate=" + lastWatchedDate;
    }
}
