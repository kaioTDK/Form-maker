package component;

import java.time.LocalDate;

public class Form {
    private String formTitle;
    private Question question;
    private LocalDate date;

    public Form(String formTitle, Question question){
        this.formTitle = formTitle;
        this.question = question;
        this.date = LocalDate.now();
    }
}
