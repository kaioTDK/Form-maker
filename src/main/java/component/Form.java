package component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public class Form {
    private String formTitle;
    private TreeMap question = new TreeMap<Short,Question>();
    private Instant date;

    public Form(String formTitle){
        this.formTitle = formTitle;
        this.date = Instant.now();
    }

    public void addQuestion(Question question){
    }
    public void removeQuestion(Question question){
        this.question.remove(question);
    }
}
