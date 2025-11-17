package component;

import component.entities.Answer;

import java.io.Serializable;

public class Question implements Serializable {
    int id;
    int order;
    Answer answer;


    public Question(int order, Answer answer) {
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

    public void setOrder(int order) {
        this.order = order;
    }
}
