package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "chat")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Chat implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "chat_id")
    private String chat_id;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "ca_id")
    private String ca_id;

    public Chat() {
    }

    public Chat(String chat_id, String user_id, String ca_id) {
        this.chat_id = chat_id;
        this.user_id = user_id;
        this.ca_id = ca_id;
    }
    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCa_id() {
        return ca_id;
    }

    public void setCar_id(String ca_id) {
        this.user_id = ca_id;
    }

    @Override
    public String toString() {
        return "user_id = " + this.user_id
                ;
    }
}
