package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity(listener = QAListener.class)
@Table(name = "q_a")
public class QA {

    /** */
    @Id
    @Column(name = "q_a_id")
    String qAId;

    /** */
    @Column(name = "question")
    String question;

    /** */
    @Column(name = "answer")
    String answer;

    /** 
     * Returns the qAId.
     * 
     * @return the qAId
     */
    public String getQAId() {
        return qAId;
    }

    /** 
     * Sets the qAId.
     * 
     * @param qAId the qAId
     */
    public void setQAId(String qAId) {
        this.qAId = qAId;
    }

    /** 
     * Returns the question.
     * 
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /** 
     * Sets the question.
     * 
     * @param question the question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /** 
     * Returns the answer.
     * 
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /** 
     * Sets the answer.
     * 
     * @param answer the answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}