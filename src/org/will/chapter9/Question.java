package org.will.chapter9;

public class Question {
    private String prompt;
    private String answer;
    private int pointValue;

    public Question() {
        this.prompt = "";
        this.answer = "";
        this.pointValue = 0;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public String display() {
        return prompt;
    }

    public int getPointValue() {
        return pointValue;
    }

    public boolean checkAnswer(String response) {
        return answer.equalsIgnoreCase(response);
    }
}
