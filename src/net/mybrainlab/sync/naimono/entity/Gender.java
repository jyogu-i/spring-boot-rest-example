package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = GenderListener.class)
@Table(name = "gender")
public class Gender {

    /** */
    @Id
    @Column(name = "gender_id")
    String genderId;

    /** */
    @Column(name = "gender")
    String gender;

    /** 
     * Returns the genderId.
     * 
     * @return the genderId
     */
    public String getGenderId() {
        return genderId;
    }

    /** 
     * Sets the genderId.
     * 
     * @param genderId the genderId
     */
    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    /** 
     * Returns the gender.
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /** 
     * Sets the gender.
     * 
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}