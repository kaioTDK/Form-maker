package component;

import component.entities.Answer;

public final class Question{
    short questionNum;
    Answer answer;


    public Question(short order, Answer answer) {
        this.questionNum = order;
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(short questionNum) {
        this.questionNum = questionNum;
    }
}
