package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "contact")
public class Contact {

    /** */
    @Id
    @Column(name = "contact_id")
    Integer contactId;

    /** */
    @Column(name = "requester_id")
    String requesterId;

    /** */
    @Column(name = "contact_message")
    String contactMessage;

    /** */
    @Column(name = "replied")
    Integer replied;

    /** 
     * Returns the contactId.
     * 
     * @return the contactId
     */
    public Integer getContactId() {
        return contactId;
    }

    /** 
     * Sets the contactId.
     * 
     * @param contactId the contactId
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    /** 
     * Returns the requesterId.
     * 
     * @return the requesterId
     */
    public String getRequesterId() {
        return requesterId;
    }

    /** 
     * Sets the requesterId.
     * 
     * @param requesterId the requesterId
     */
    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    /** 
     * Returns the contactMessage.
     * 
     * @return the contactMessage
     */
    public String getContactMessage() {
        return contactMessage;
    }

    /** 
     * Sets the contactMessage.
     * 
     * @param contactMessage the contactMessage
     */
    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    /** 
     * Returns the replied.
     * 
     * @return the replied
     */
    public Integer getReplied() {
        return replied;
    }

    /** 
     * Sets the replied.
     * 
     * @param replied the replied
     */
    public void setReplied(Integer replied) {
        this.replied = replied;
    }
}