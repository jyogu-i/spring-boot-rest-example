package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "request")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Request implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "request_id")
    private String request_id;

    @Column(name = "requester_id")
    private String requester_id;

    @Column(name = "request_message")
    private String request_message;

    public Request() {
    }

    public Request(String request_id, String requester_id, String request_message) {
        this.request_id = request_id;
        this.requester_id = requester_id;
        this.request_message = request_message;
    }
    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getRequester_id() {
        return requester_id;
    }

    public void setRequester_id(String requester_id) {
        this.requester_id = requester_id;
    }

    public String getAnswer() {
        return request_message;
    }

    public void setRequest_message(String request_message) {
        this.request_message = request_message;
    }


    @Override
    public String toString() {
        return "request_id = " + this.request_id;
    }
}
