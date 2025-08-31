package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MediaApp {
	
	public static List<Song> createSongList()
	{
		List<Song> songlist = new ArrayList<>();
		Set<String> singers1 = new TreeSet<>();
		singers1.add("S");
		singers1.add("SH");
		Set<String> singers2 = new TreeSet<>();
		singers2.add("A");
		singers2.add("SU");
		Set<String> singers3 = new TreeSet<>();
		singers3.add("J");
		singers3.add("PH");
		Set<String> singers4 = new TreeSet<>();
		singers4.add("N");
		singers4.add("NA");
		songlist.add(new Song("ssss", 2020, singers1, 5, "mmmm"));
		songlist.add(new Song("aaaa", 2022, singers2, 4, "pppp"));
		songlist.add(new Song("rrrrr", 2020, singers1, 4, "mmmm"));
		songlist.add(new Song("cccc", 2022, singers3, 3, "tttttt"));
		songlist.add(new Song("bbbb", 2022, singers4, 5, "tttttt"));
		
		return songlist;
	}
	
	public static void addSong(List<Song> songlist, Song song)
	{
		songlist.add(song);
	}
	
	public static void printList(List<Song> songlist)
	{
		for(Song song : songlist)
		{
			System.out.println(song);
		}
	}
	
	public static List<Song> filterByArtist(List<Song> songlist, String singer)
	{
		List<Song> byartist = new ArrayList<>();
		for(Song song : songlist)
		{
			if(song.getSingers().contains(singer))
			{
				byartist.add(song);
			}
		}
		return byartist;
	}
	
	public static Map<String, String> mapByMovie(List<Song> songlist)
	{
		Map<String, String> bymovie = new TreeMap<>();
		for(Song song : songlist)
		{
			bymovie.put(song.getTitle(), song.getMovie());
		}
		return bymovie;
	}

	public static void main(String[] args) {		
		List<Song> songlist = MediaApp.createSongList();
		MediaApp.printList(songlist);
		
		System.out.println("-----Songs by S-----");
		List<Song> byartist =MediaApp.filterByArtist(songlist, "S");
		MediaApp.printList(byartist);
		
		System.out.println("-----Sort By Title-----");
		Collections.sort(songlist);
		MediaApp.printList(songlist);
		
		System.out.println("-----Search By Title-----");
		int found =Collections.binarySearch(songlist, new Song("rrrrr", 0, null, 0, null));
		System.out.println("Found at :" + found);
		
		System.out.println("-----Sort By Release Year-----");
		Collections.sort(songlist, new YearComparator());
		MediaApp.printList(songlist);
		
		System.out.println("-----Search By Release Year-----");
		found =Collections.binarySearch(songlist, new Song(null, 2022, null, found, null),
				new YearComparator());
		System.out.println("Found at :" + found);
		
		System.out.println("-----Ma by Movie------------");
		Map<String, String> bymovie =MediaApp.mapByMovie(songlist);
		for(Entry<String, String> entry : bymovie.entrySet())
		{
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
