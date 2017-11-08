package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "contact")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "contact_id")
    private String contact_id;

    @Column(name = "requester_id")
    private String requester_id;

    @Column(name = "contact_message")
    private String contact_message;

    @Column(name = "replied")
    private int replied;

    public Contact() {
    }

    public Contact(String contact_id, String requester_id, String contact_message,int replied) {
        this.contact_id = contact_id;
        this.requester_id = requester_id;
        this.contact_message = contact_message;
        this.replied = replied;
    }

    public String getContact_id() {
        return contact_id;
    }

    public void setContact_id(String contact_id) {
        this.contact_id = contact_id;
    }

    public String getRequester_id() {
        return requester_id;
    }

    public void setRequester_id(String requester_id) {
        this.requester_id = requester_id;
    }

    public String getContact() {
        return contact_message;
    }

    public void setContact_message(String contact_message) {
        this.contact_message = contact_message;
    }

    public int getReplied() {
        return replied;
    }

    public void setReplied(int replied) {
        this.replied = replied;
    }

    @Override
    public String toString() {
        return "contact_id = " + this.contact_id;
    }
}
