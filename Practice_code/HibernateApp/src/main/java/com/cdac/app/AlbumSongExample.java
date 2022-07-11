package com.cdac.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cad.dao.AlbumSongDao;
import com.cad.dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongExample {
	
	public static void main(String[] args) {
//		GenericDao dao = new GenericDao();
		AlbumSongDao dao = new AlbumSongDao();
		
		//adding an album
//		Album album = new Album();
//		album.setName("Hits of 1990");
//		album.setReleaseDate(LocalDate.of(1996, 12, 30));
//		album.setCopyright("Sony Music");		
//		dao.save(album);
		
		//adding song to an album
//		Album album1 = (Album) dao.fetchById(Album.class, 2);
//		Song song = new Song();
//		song.setTitle("main tera");
//		song.setArtist("Arjit singh");
//		song.setDuration(5.10);
//		song.setAlbum(album1);
//		dao.save(song);
		
//		List<Song> songs = dao.fetchSongsSungBy("KK");
//		for(Song song : songs)
//			System.out.println(song.getTitle() + " " + song.getDuration()+" "+song.getArtist()); 
		
//		dao.delete(Song.class, 8);
		
		/*Album album = new Album();
		album.setName("cat");
		album.setReleaseDate(LocalDate.of(2011, 04, 20));
		album.setCopyright(" Ozark Music");


		Album album1	= (Album)dao.fetchById(Album.class, 4);
		List<Song> list = new ArrayList<Song>();
		Song song = new Song();
		song.setTitle("song");
		song.setArtist("abc");
		song.setDuration(4.13);
		song.setAlbum(album1);

		list.add(song);

		song = new Song();
		song.setTitle("song2");
		song.setArtist("def");
		song.setDuration(4.24);
		
		song.setAlbum(album1);
		list.add(song);

		song = new Song();
		song.setTitle("song3");
		song.setArtist("mno");
		song.setDuration(5.02);
		song.setAlbum(album1);

		list.add(song);

//		album.setSongs(list);
//		List<Song> list2= album.getSongs();
//		for(Song s : list2)
//			System.out.println(s);
		dao.save(album1);*/
		
		//Understanding lazy and eager concept
		Album album = (Album) dao.fetchById(Album.class, 1);
		System.out.println(album.getName()+" "+album.getCopyright()+" "+album.getReleaseDate());
		List<Song> songs = album.getSongs();
		for(Song song : songs)
			System.out.println(song.getTitle()+" "+song.getArtist()+" "+song.getDuration());
		
 
	}
}           
