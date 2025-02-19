package org.will.chapter9.quizzes;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    public ChoiceQuestion(String prompt) {
        super(prompt);
        choices = new ArrayList<>();
    }

    public ChoiceQuestion() {
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    @Override
    public String display() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.display()).append("\n");

        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            builder.append(choiceNumber).append(": ").append(choices.get(i)).append("\n");
        }

        return builder.toString();
    }
}
