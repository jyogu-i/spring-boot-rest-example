package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "Chat")
public class Chat {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    int chatId;

    /** */
    @Column(name = "user_id")
    String userId;

    /** */
    @Column(name = "ca_id")
    String caId;

    @Column(name = "flg")
    int flg;

    @Column(name = "count")
    int count;

    @Column(name = "update")
    String update;

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

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public int getFlg() {
        return flg;
    }

    public void setFlg(int flg) {
        this.flg = flg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
}