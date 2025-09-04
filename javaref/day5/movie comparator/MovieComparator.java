package day5;

import java.util.Comparator;

public class MovieComparator implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		return o1.getMovie().compareTo(o2.getMovie());
	}
	

}
