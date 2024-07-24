package com.crio.xquiz;
import java.util.*;

public class Question{
    // Define the variable to store the question text
    private String questionText;
    // Define the variable to store the answer text
    private String answer;
    // Define the variable to store the list of text choices
    private List<String> choices;

    // Create the Question class constructor 
    public Question(String questionText, List<String> choices, String answer) {
        if (questionText == null || questionText.isEmpty()) {
                System.out.println("Question text cannot be null or empty!");
        }
        else if (choices == null || choices.isEmpty()) {
                System.out.println("Choices cannot be null or empty!");
        }
        else if (answer == null || answer.isEmpty()) {
                System.out.println("Answer cannot be null or empty!");
        }
        else if (!isAnswerValid(answer, choices)) {
                System.out.println("Answer is not present among the choices!");
        }
        else {
                this.questionText = questionText;
                this.answer = answer;
                this.choices = choices;
        }
        
    }
            
    private boolean isAnswerValid(String answer, List<String> choicesList) {
        boolean isValid = false;
        for (String choice : choicesList) {
                if (choice.equals(answer)) {
                        isValid = true;
                        break;
                }
        }
        return isValid;
    }     

    // Create the getter method : public String getAnswer(), which returns the answer
    public String getAnswer() {
        return answer;
    }

    // Create the getter method : public String getQuestionText(), which returns the questionText
    public String getQuestionText() {
        return questionText;
    }

    // Create the getter method : public List<String> getChoices(), which returns the choices
    public List<String> getChoices() {
        return choices;
    }

    // Create the method checkAnswer() with signature: public boolean checkAnswer(String answer)
        // Validate: If answer provided in the input matches the existing answer for the given question, then return True
        // Else:  return False.
    public boolean checkAnswer(String answer) {
        if (answer == this.answer) {
                return true;
        }
        return false;
    }

    public void display(){
        System.out.println(getQuestionText());
        for(int i = 0; i < choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ":" + choices.get(i));
        }
    }

}

