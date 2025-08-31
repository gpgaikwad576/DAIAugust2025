package day5;

import java.util.Comparator;

public class YearComparator implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		return Integer.compare(o1.getReleaseyear(), o2.getReleaseyear());
	}
	

}
