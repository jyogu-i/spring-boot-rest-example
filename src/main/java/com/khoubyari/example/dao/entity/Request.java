package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "request")
public class Request {

    /** */
    @Column(name = "request_id")
    Integer requestId;

    /** */
    @Id
    @Column(name = "requester_id")
    String requesterId;

    /** */
    @Column(name = "request_message")
    String requestMessage;

    /** 
     * Returns the requestId.
     * 
     * @return the requestId
     */
    public Integer getRequestId() {
        return requestId;
    }

    /** 
     * Sets the requestId.
     * 
     * @param requestId the requestId
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
     * Returns the requestMessage.
     * 
     * @return the requestMessage
     */
    public String getRequestMessage() {
        return requestMessage;
    }

    /** 
     * Sets the requestMessage.
     * 
     * @param requestMessage the requestMessage
     */
    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }
}