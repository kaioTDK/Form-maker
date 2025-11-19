package component;

import component.entities.Answer;

import java.io.Serializable;

public final class Question{
    short order;
    Answer answer;


    public Question(short order, Answer answer) {
        this.order = order;
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(short order) {
        this.order = order;
    }
}
