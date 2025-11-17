package component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

public class Form {
    private String formTitle;
    private ArrayList<Question> question;
    private Instant date;

    public Form(String formTitle, Question firstQuestion){
        this.formTitle = formTitle;
        this.question.add(firstQuestion);
        this.date = Instant.now();
    }

    public void addQuestion(Question question){
        this.question.add(question);
    }
    public void removeQuestion(Question question){
        this.question.remove(question);
    }
}
