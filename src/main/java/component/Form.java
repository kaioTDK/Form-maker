package component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

public class Form {
    private String formTitle;
    private ArrayList question;
    private Instant date;

    public Form(String formTitle, ArrayList<Question> questions){
        this.formTitle = formTitle;
        this.question = questions;
        this.date = Instant.now();
    }

}
