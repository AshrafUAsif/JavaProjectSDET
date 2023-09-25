import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminPanel {
    public void addQuestion() throws IOException {
        JSONArray jsonArray = new JSONArray();
//        FileWriter fileWriter = new FileWriter("./src/main/resources/quiz.json");
        do {
            JSONObject jsonObject1 = new JSONObject();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your question : ");
            String question = sc.nextLine();

            System.out.println("option 1 : ");
            String option1 = sc.nextLine();

            System.out.println("option 2 : ");
            String option2 = sc.nextLine();

            System.out.println("option 3 : ");
            String option3 = sc.nextLine();

            System.out.println("option 4 : ");
            String option4 = sc.nextLine();

            System.out.println("answerkey : ");
            String answerKey = sc.nextLine();

            jsonObject1.put("question",question);
            jsonObject1.put("option1",option1);
            jsonObject1.put("option2",option2);
            jsonObject1.put("option3",option3);
            jsonObject1.put("option4",option4);
            jsonObject1.put("answerKey",answerKey);
            jsonArray.add(jsonObject1);
            System.out.println("Press 's' to start again, 'q' to quit, or any other key to add another question.");
            String continueInput = sc.next();

            if (continueInput.equalsIgnoreCase("q")) {
                break;
            } else if (continueInput.equalsIgnoreCase("s")) {

            }
        }
        while (true);

//        fileWriter.write(jsonArray.toJSONString());
    }
}
