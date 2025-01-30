package org.will.chapter9;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Question question = new Question();
        question.setPrompt("What is the answer to life, the universe, and everything?");
        question.setAnswer("42");
        question.setPointValue(42);

        ChoiceQuestion choiceQuestion = new ChoiceQuestion();
        choiceQuestion.setPrompt("What is the best day of the week?");
        choiceQuestion.addChoice("Sunday", false);
        choiceQuestion.addChoice("Monday", false);
        choiceQuestion.addChoice("Tuesday", false);
        choiceQuestion.addChoice("Wednesday", false);
        choiceQuestion.addChoice("Thursday", false);
        choiceQuestion.addChoice("Friday", false);
        choiceQuestion.addChoice("Saturday", true);
        choiceQuestion.setPointValue(8);

        presentQuestion(question, in);
        presentQuestion(choiceQuestion, in);
    }

    public static void presentQuestion(Question question, Scanner in) {

        System.out.println(question.display());
        System.out.print("Your response: ");
        String response = in.nextLine();
        boolean correct = question.checkAnswer(response);
        System.out.println(correct);
        if (correct) {
            System.out.printf("You earned %d points\n", question.getPointValue());
        } else {
            System.out.println("You earned 0 points\n");
        }
    }
}
