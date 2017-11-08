package com.khoubyari.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/*
 *
 *
 */
@Entity
@Table(name = "q_a")
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Q_A implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @Column(name = "q_a_id")
    private String q_a_id;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    private String answer;

    public Q_A() {
    }

    public Q_A(String q_a_id, String question, String answer) {
        this.q_a_id = q_a_id;
        this.question = question;
        this.answer = answer;
    }
    public String getQ_a_id() {
        return q_a_id;
    }

    public void setQ_a_id(String q_a_id) {
        this.q_a_id = q_a_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    @Override
    public String toString() {
        return "q_a_id = " + this.q_a_id;
    }
}
