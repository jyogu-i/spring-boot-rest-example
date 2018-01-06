package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "place")
public class Place {

    /** */
    @Id
    @Column(name = "place_id")
    String placeId;

    /** */
    @Column(name = "place")
    String place;

    /** 
     * Returns the placeId.
     * 
     * @return the placeId
     */
    public String getPlaceId() {
        return placeId;
    }

    /** 
     * Sets the placeId.
     * 
     * @param placeId the placeId
     */
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /** 
     * Returns the place.
     * 
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Sets the place.
     * 
     * @param place the place
     */
    public void setPlace(String place) {
        this.place = place;
    }
}