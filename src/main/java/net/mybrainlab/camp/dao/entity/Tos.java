package net.mybrainlab.camp.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "Tos")
public class Tos {

    /** */
    @Id
    @Column(name = "tos_id")
    String tosId;

    /** */
    @Column(name = "tos_name")
    String tosName;

    /** */
    @Column(name = "topic_id")
    String topicId;

    @Column(name = "sentence")
    String sentence;

    /**
     * Returns the requestId.
     *
     * @return the requestId
     */
    public String getTosId() {
        return tosId;
    }

    public void setTosId(String tosId) {
        this.tosId = tosId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTosName() {
        return tosName;
    }

    public void setTosName(String tosName) {
        this.tosName = tosName;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}