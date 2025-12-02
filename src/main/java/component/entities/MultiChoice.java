package component.entities;

import java.util.Map;
import java.util.TreeMap;

public final class MultiChoice implements Answer {
    private char rightChoice;
    Map choices = new TreeMap<Character,String>();

    public MultiChoice(char rightChoice) {
        this.rightChoice = rightChoice;
    }

    public void setAnswer(char answerChoice){
        this.rightChoice = answerChoice;
    }

    @Override
    public void setAnswer(char answerChoice, String answerAlternative){

        if (choices.containsKey(answerChoice)){
            System.out.println("Position already taken, switch or use another one.");
            return;
        }
        this.rightChoice = answerChoice;
        choices.put(answerChoice, answerAlternative);
    }

    public void addAnswer(char answerChoice, String answerAlternative){

    }


}
