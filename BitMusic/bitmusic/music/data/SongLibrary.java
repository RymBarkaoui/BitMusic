/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.music.data;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.io.Serializable;

/**
 * Class which allows to manage a songlibrary.
 * @author Music Team
 */

public class SongLibrary implements Serializable{
    
   private ArrayList<Song> library; 
   private static final long serialVersionUID = 300L;

   /**
    * constructor.
    * 
    * @param songs 
    */
   public SongLibrary(ArrayList<Song> songs)
   {
    library = new ArrayList<>();
    library = songs;
   }
   
   /**
    * Returns the list of songs.
    * @return library
    */
   public ArrayList<Song> getlibrary()
   {
       return library;
   }
   
   /**
    * Set the list of songs.
    * @param lib a library
    */
   public void setlibrary (ArrayList<Song> lib)
   {
       library = lib;
   }
   
   /**
    * Returns true if the song with the ID songID is in the list.
    * @param songId the songId of the song 
    * @return true if song isLocal false if not
    */
    public boolean islocal(String songId)
    {   
    Iterator<Song> it = library.iterator();
    
    while (it.hasNext())
    {  
        Song s = it.next();
        if (s.getSongId().equals(songId))
            return true;
        }  
    return false;
 } 
   
   /**
    * returns the songID of a song.
    * @param songId the songid of the song
    * @return a song
    */
    public Song getSong(String songId)
    {
	Iterator<Song> it = library.iterator();
		
	while (it.hasNext())
	{  
            Song s = it.next();
            if (s.getSongId().equals(songId))
		return s;
	}  
	return null;
    }
   
   /**
    * Removes the song songId.
    * @param songId 
    */
    
   public void removeSong (String songId)
   {
   Iterator<Song> it=library.iterator();
   while(it.hasNext()) //while there is still a song in the library
    {
       Song song=it.next();
       if(song.getSongId().equals(songId))
       library.remove(song); 
            //removes the song with the id songId from the library
   
   }
   }
   
   /**
    * Adds song to the song list.
    * @param song the song we want to add
    */
   public void addSong(Song song)
   {       
       this.library.add(song);       
   }
   
   /**
    * Adds the category name to each song og the list song. 
    * @param name the name of the category
    * @param rights the rights for this category
    */
   
   public void addCategory (String name, Rights rights)
   {
   Iterator<Song> it = library.iterator();
   while(it.hasNext())
       {
           Song song = it.next();
           song.updateCategory(name, rights);
       }
   }
   
   /**
    * Removes the category name to each song of the song list.
    * @param name the name of the category we want to remove
    */
   public void removeCategory (String name)
   {
   Iterator<Song> it = library.iterator();
   while(it.hasNext()) //while there is still a song in the library
    {
       Song song = it.next();
       song.deleteCategory(name);// put default parameters to category name
   
    }
   }
}
   
   
   
   


   
   
   
   
   
   
   
   
   

