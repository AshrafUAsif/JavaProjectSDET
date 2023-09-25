import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Login login = new Login();
        boolean bol = login.loginUser();


        if (bol){
            AdminPanel adminPanel = new AdminPanel();
            adminPanel.addQuestion();


        }
        else if (!bol){
            StudentPanel studentPanel = new StudentPanel();
            for (int i=0; i<10; i++){

                studentPanel.showQuestions(i);
            }
            System.out.println("You've corrected " +studentPanel.getMarks()+ "answers");

            int marks = studentPanel.getMarks();
            if (marks >= 8 ){
                System.out.println("Excellent! You have got" +marks+"out of 10");
            } else if (marks >=5 && marks < 8) {
                System.out.println("Good! You have got" +marks+"out of 10");
            }
            else if (marks >=2 && marks < 5){
                System.out.println("Very poor! You have got" +marks+"out of 10");
            }
            else {
                System.out.println("Very sorry you are failed! You have got" +marks+"out of 10");
            }

        }







































       /*
        JSONArray jsonArray = new JSONArray();
//        login.loginUser();
        FileWriter fileWriter = new FileWriter("./src/main/resources/users.json");
        for (int i = 0; i<3; i++){
        JSONObject jsonObject1 = new JSONObject();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name : ");
            String name = sc.next();
            System.out.println("Enter your password : ");
            String password = sc.next();
            System.out.println("Enter your role : ");
            String role = sc.next();
        jsonObject1.put("name",name);
        jsonObject1.put("password",password);
        jsonObject1.put("role",role);
        jsonArray.add(jsonObject1);
        }
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.flush(); */


    }
}
