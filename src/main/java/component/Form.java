package component;

import java.time.Instant;
import java.util.TreeMap;

public class Form {

    private static short questionNum = 0;
    private String formTitle;
    private TreeMap questions = new TreeMap<Short,Question>();
    final private Instant date = Instant.now();




    public Form(String formTitle){
        this.formTitle = formTitle;
    }

    public void addQuestion(Question question){
        questions.put(questionNum,question);
        question.setQuestionNum(questionNum);
        questionNum++;
    }

    public void removeQuestion(Question question){
        this.questions.remove(question);
    }

    public Instant getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Form{" +
                "formTitle='" + formTitle + '\'' +
                ", questions=" + questions +
                ", date=" + date +
                '}';
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public String getFormTitle() {  return formTitle;}

    public static short getQuestionNum() {
        return questionNum;
    }
}
