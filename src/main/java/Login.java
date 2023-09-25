import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class Login {
    public boolean loginUser() throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username : ");
        String userName = sc.next();
        System.out.println("Please enter your password : ");
        String password = sc.next();

        FileReader fileReader = new FileReader("./src/main/resources/users.json");
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(fileReader);
        boolean loggedIn = false;
        boolean log = false;
        for(Object obj : jsonArray){
            JSONObject jsonObject = new JSONObject();
            jsonObject = (JSONObject) obj;
            String storedUserName = (String) jsonObject.get("name");
            String storedUserPassword = (String) jsonObject.get("password");
            String userRole = (String) jsonObject.get("role");
            if (userName.equals(storedUserName) && password.equals(storedUserPassword) && userRole.equals("admin")){
                System.out.println("Welcome Admin! Logged in successfully");
                loggedIn = true;
                log = true;
                break;
            } else if (userName.equals(storedUserName) && password.equals(storedUserPassword) && userRole.equals("student")) {
                System.out.println("Welcome Student! Logged in successfully");

                loggedIn = true;
                log = false;
                break;
            }
        }
        if (!loggedIn){
            System.out.println("Please enter valid username or password");
        }
        return log;
    }
}
