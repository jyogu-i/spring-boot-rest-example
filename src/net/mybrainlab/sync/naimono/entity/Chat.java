package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = ChatListener.class)
@Table(name = "chat")
public class Chat {

    /** */
    @Id
    @Column(name = "chat_id")
    Integer chatId;

    /** */
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "ca_id")
    String caId;

    /** 
     * Returns the chatId.
     * 
     * @return the chatId
     */
    public Integer getChatId() {
        return chatId;
    }

    /** 
     * Sets the chatId.
     * 
     * @param chatId the chatId
     */
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** 
     * Returns the caId.
     * 
     * @return the caId
     */
    public String getCaId() {
        return caId;
    }

    /** 
     * Sets the caId.
     * 
     * @param caId the caId
     */
    public void setCaId(String caId) {
        this.caId = caId;
    }
}