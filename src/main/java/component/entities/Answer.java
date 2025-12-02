package component.entities;

import java.util.ArrayList;

public sealed interface Answer permits OpenAnswer, MultiChoice {

    abstract void setAnswer(char answerChoice, String answerAlternative);
}
