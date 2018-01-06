package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "contact")
public class Contact {

    String contactMessage;

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

}