# XQuiz

A CLI based quiz created by Java Backend with unit tests

### What is it?

XQuiz is a quiz program implemented with Java. Features are as follows -

* It uses OOPs concept of Encapsulation
* Code is modularized into 2 sections -

  * Question Class - This class represents a Question blueprint in a Quiz. It has following components -

    * Attributes -
      * questionText - String representing the Question text displayed to user
      * answer - String representing the answer to the question
      * Choices - List of choices of answer shown to user
    * Methods -
      * checkAnswer - Checks if User provided answer is indeed the right answer. Returns true if correct
  * Quiz - This class represents a Quiz blueprint. It uses Questions in it. It has following components -

    * Attributes -
      * quizName - Represents the name of the Quiz in String data type
      * questions - List of questions that belong to the quiz
      * finalScore - Final score of the user for the attempted quiz
    * Methods -
      * addQuestion - Adds the given question to the Quiz
      * attemptQuiz - This creates the quiz environment with which user is shown questions and their inputs are taken for the questions
      * revealAnswerKey - Generates answer for each question
      * getFinalScore - Getter method to get the final score once quiz is attempted
* It has unit Tests for the functionalities/scenarios like if user response is correct to a quiz, incorrect etc using Junit Jupiter

### How do I run it?

I personally use Gradle for it with VSCode for code editing.

##### Code was developed with -

* Java - 21
* Gradle - 8.9
* Junit Jupiter - 8.5

## Steps are -

1. Install Java
2. Install Gradle
3. Run command -
   ```bash
   gradle init --package com.backend.xquiz
   ```
4. Clone the project
5. Install Extensions in vscode
   1. Java By Oracle
   2. Extension pack for Java by Microsoft
   3. Test Runner for Java by Microsoft
   4. Gradle for Java by Microsoft
   5. Language Support for Java By Red Hat
6. You can choose to run from the VSCode code, there's a run button in App.java main function to execute the code
7. You can go to the Beaker symbol and execute all test cases
8. Run command - for running test cases
   ```
   ./gradlew build
   ```
9. Run command - for running the app.java code
   ```
   ./gradlew run
   ```
