package com.khoubyari.example.dao.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "Personal_info")
public class PersonalInfo {

    /** */
    @Id
    @Column(name = "topic_id")
    String topicId;

    /** */
    @Column(name = "title_id")
    String titleId;

    /** */
    @Column(name = "sentence_id")
    String sentenceId;


    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String titleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getSentenceId() {
        return sentenceId;
    }

    public void setSentenceId(String sentenceId) {
        this.sentenceId = sentenceId;
    }
}