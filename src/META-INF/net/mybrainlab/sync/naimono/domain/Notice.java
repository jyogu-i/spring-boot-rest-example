package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "notice")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Notice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "notice_id")
    private String notice_id;

    @Column(name = "sender")
    private String sender;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private String date;

    @Column(name = "notice_message")
    private String notice_message;

    @Column(name = "flg")
    private int flg;

    public Notice() {
    }

    public Notice(String notice_id, String sender, String title,
                  String date, String notice_message, int flg) {
        this.notice_id = notice_id;
        this.sender = sender;
        this.title = title;
        this.date = date;
        this.notice_message = notice_message;
        this.flg = flg;
    }

    public String getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(String notice_id) {
        this.notice_id = notice_id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotice_message() {
        return notice_message;
    }

    public void setNotice_message(String notice_message) {
        this.notice_message = notice_message;
    }

    public int getFlg() {
        return flg;
    }

    public void setFlg(int flg) {
        this.flg = flg;
    }


    @Override
    public String toString() {
        return "notice_id = " + this.notice_id;
    }
}
