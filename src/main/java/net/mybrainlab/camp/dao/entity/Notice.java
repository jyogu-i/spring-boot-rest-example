package net.mybrainlab.camp.dao.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "notice")
public class Notice {

    /** */
    @Id
    @Column(name = "notice_id")
    String noticeId;

    /** */
    @Column(name = "sender")
    String sender;

    /** */
    @Column(name = "title")
    String title;

    /** */
    @Column(name = "date")
    String date;

    /** */
    @Column(name = "notice_message")
    String noticeMessage;

    /** */
    @Column(name = "flg")
    Integer flg;

    /** 
     * Returns the noticeId.
     * 
     * @return the noticeId
     */
    public String getNoticeId() {
        return noticeId;
    }

    /** 
     * Sets the noticeId.
     * 
     * @param noticeId the noticeId
     */
    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    /** 
     * Returns the sender.
     * 
     * @return the sender
     */
    public String getSender() {
        return sender;
    }

    /** 
     * Sets the sender.
     * 
     * @param sender the sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /** 
     * Returns the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Sets the title.
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Returns the date.
     * 
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /** 
     * Sets the date.
     * 
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /** 
     * Returns the noticeMessage.
     * 
     * @return the noticeMessage
     */
    public String getNoticeMessage() {
        return noticeMessage;
    }

    /** 
     * Sets the noticeMessage.
     * 
     * @param noticeMessage the noticeMessage
     */
    public void setNoticeMessage(String noticeMessage) {
        this.noticeMessage = noticeMessage;
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
}