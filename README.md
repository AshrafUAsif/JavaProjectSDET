# JavaProjectSDET
# Quiz Management System

This is a simple Java project for a Quiz Management System that allows administrators to add questions to a quiz bank and students to take a quiz. The system is divided into three classes:

1. **Login**: The login class allows users to log in as either an admin or a student based on their credentials.

2. **AdminPanel**: Admins can use this class to add questions to the quiz bank. Questions are stored in a JSON file.

3. **StudentPanel**: Students can use this class to take a quiz. The quiz questions are randomly selected from the quiz bank, and students receive feedback on their performance.

## How to Use

1. Clone the repository to your local machine.

2. Build the project using Gradle:

3. Run the project:

4. Follow the prompts to log in as an admin or a student and use the system accordingly.

## Project Structure

- `src/`: Contains the Java source code for the project.
- `Main.java`: The main class to run the program.
- `Login.java`: Handles user login.
- `AdminPanel.java`: Allows admins to add questions.
- `StudentPanel.java`: Allows students to take the quiz.

- `src/main/resources/`: Contains the JSON files for storing questions.
- `quiz.json`: Stores quiz questions.

## Dependencies

- [JSON Simple](https://code.google.com/archive/p/json-simple/): Used for JSON parsing and handling.




