/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.music.data;
import java.io.Serializable;

/**
 *
 * Grade class.
 * @author Music Team
 */
public class Grade implements Serializable{
    
    /**
     * Serialization UID, between 300 and 399 for the mp3 group.
     */
    private static final long serialVersionUID = 371L;
    /**
     * Song's grade (out of 5).
     */
    private int grade;

    /**
     * Grade's author.
     */
    private String authorId;
    
    /**
     * Class constructor.
     * 
     * @param author    CurrentUserId
     * @param newgrade  Grade given by user
     */
    public Grade(String author, int newgrade) {
        this.authorId = author;
        this.grade = newgrade;
    }
    
    /**
     * Grade Getter.
     * @return this grade
     */
    public int getGrade() {
        return this.grade;
    }

    /**
     * AuthorId Getter.
     * @return this authorId
     */
    public String getAuthorId() {
        return this.authorId;                    
    }
}
