package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "message")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private String message_id;

    @Column(name = "chat_id")
    private String chat_id;

    @Column(name = "ca_img")
    private String ca_img;

    @Column(name = "ca_name")
    private String ca_name;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "speaker_id")
    private String speaker_id;

    @Column(name = "flg")
    private int flg;

    @Column(name = "date")
    private String date;

    @Column(name = "chat_message")
    private String chat_message;

    public Message() {
    }

    public Message(String message_id, String chat_id, String ca_img, String ca_name, String user_name,
                   String speaker_id, String chat_message) {
        this.chat_id = chat_id;
        this.message_id =message_id;
        this.ca_img = ca_img;
        this.ca_name = ca_name;
        this.user_name = user_name;
        this.speaker_id = speaker_id;
        this.chat_message = chat_message;
    }
    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public String getCa_img() {
        return ca_img;
    }

    public void setCa_img(String ca_img) {
        this.ca_img = ca_img;
    }

    public String getCa_name() {
        return ca_name;
    }

    public void setCa_name(String ca_name) {
        this.ca_name = ca_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(String speaker_id) {
        this.speaker_id = speaker_id;
    }

    public int getFlg() {
        return flg;
    }

    public void setFlg(int flg) {
        this.flg= flg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChat_message() {
        return chat_message;
    }

    public void setChat_message(String chat_message) {
        this.chat_message = chat_message;
    }


    @Override
    public String toString() {
        return "message_id = " + this.message_id;
    }
}
