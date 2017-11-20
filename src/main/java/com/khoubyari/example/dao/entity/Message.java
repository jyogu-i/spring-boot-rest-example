package com.khoubyari.example.dao.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "message")
public class Message {

    /** */
    @Id
    @Column(name = "message_id")
    Integer messageId;

    /** */
    @Column(name = "chat_id")
    Integer chatId;

    /** */
    @Column(name = "ca_img")
    String caImg;

    /** */
    @Column(name = "ca_name")
    String caName;

    /** */
    @Column(name = "user_name")
    String userName;

    /** */
    @Column(name = "speaker_id")
    String speakerId;

    /** */
    @Column(name = "flg")
    Integer flg;

    /** */
    @Column(name = "chat_message")
    String chatMessage;

    /** */
    @Column(name = "date")
    LocalDate date;

    /** 
     * Returns the messageId.
     * 
     * @return the messageId
     */
    public Integer getMessageId() {
        return messageId;
    }

    /** 
     * Sets the messageId.
     * 
     * @param messageId the messageId
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /** 
     * Returns the chatId.
     * 
     * @return the chatId
     */
    public int getChatId() {
        return chatId;
    }

    /** 
     * Sets the chatId.
     * 
     * @param chatId the chatId
     */
    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    /** 
     * Returns the caImg.
     * 
     * @return the caImg
     */
    public String getCaImg() {
        return caImg;
    }

    /** 
     * Sets the caImg.
     * 
     * @param caImg the caImg
     */
    public void setCaImg(String caImg) {
        this.caImg = caImg;
    }

    /** 
     * Returns the caName.
     * 
     * @return the caName
     */
    public String getCaName() {
        return caName;
    }

    /** 
     * Sets the caName.
     * 
     * @param caName the caName
     */
    public void setCaName(String caName) {
        this.caName = caName;
    }

    /** 
     * Returns the userName.
     * 
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /** 
     * Sets the userName.
     * 
     * @param userName the userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** 
     * Returns the speakerId.
     * 
     * @return the speakerId
     */
    public String getSpeakerId() {
        return speakerId;
    }

    /** 
     * Sets the speakerId.
     * 
     * @param speakerId the speakerId
     */
    public void setSpeakerId(String speakerId) {
        this.speakerId = speakerId;
    }

    /** 
     * Returns the flg.
     * 
     * @return the flg
     */
    public Integer getFlg() {
        return flg;
    }

    /** 
     * Sets the flg.
     * 
     * @param flg the flg
     */
    public void setFlg(Integer flg) {
        this.flg = flg;
    }

    /** 
     * Returns the chatMessage.
     * 
     * @return the chatMessage
     */
    public String getChatMessage() {
        return chatMessage;
    }

    /** 
     * Sets the chatMessage.
     * 
     * @param chatMessage the chatMessage
     */
    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    /** 
     * Returns the date.
     * 
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Sets the date.
     * 
     * @param date the date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}