package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "english")
public class English {

    /** */
    @Id
    @Column(name = "english_id")
    String englishId;

    /** */
    @Column(name = "english")
    String english;

    /** 
     * Returns the englishId.
     * 
     * @return the englishId
     */
    public String getEnglishId() {
        return englishId;
    }

    /** 
     * Sets the englishId.
     * 
     * @param englishId the englishId
     */
    public void setEnglishId(String englishId) {
        this.englishId = englishId;
    }

    /** 
     * Returns the english.
     * 
     * @return the english
     */
    public String getEnglish() {
        return english;
    }

    /** 
     * Sets the english.
     * 
     * @param english the english
     */
    public void setEnglish(String english) {
        this.english = english;
    }
}