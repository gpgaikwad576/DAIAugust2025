package day5;

import java.util.Set;

public class Song implements Comparable<Song>{

	private String title;
	private int releaseyear;
	private Set<String> singers;
	private int rating;
	private String movie;
	public Song(String title, int releaseyear, Set<String> singers, int rating, String movie) {
		super();
		this.title = title;
		this.releaseyear = releaseyear;
		this.singers = singers;
		this.rating = rating;
		this.movie = movie;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public Set<String> getSingers() {
		return singers;
	}
	public void setSingers(Set<String> singers) {
		this.singers = singers;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", releaseyear=" + releaseyear + ", singers=" + singers + ", rating=" + rating
				+ ", movie=" + movie + "]";
	}
	@Override
	public int compareTo(Song o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	
	
}
