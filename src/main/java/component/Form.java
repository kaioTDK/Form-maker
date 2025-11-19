package component;

import java.time.Instant;
import java.util.TreeMap;

public class Form {
    private short questionNum = 0;
    private String formTitle;
    private TreeMap questions = new TreeMap<Short,Question>();
    private Instant date;

    public Form(String formTitle){
        this.formTitle = formTitle;
        this.date = Instant.now();
    }

    public void addQuestion(Question question){
        questions.put(questionNum,question);
        question.setQuestionNum(this.questionNum);
        this.questionNum++;
    }
    public void removeQuestion(Question question){
        this.questions.remove(question);
    }
}
