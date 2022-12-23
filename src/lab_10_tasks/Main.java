package lab_10_tasks;/*
Write a java program based on filing. Perform Create, Read and Write operations on JSON file.
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main{
    public static void main(String[] args) {
        String filename = "example.json" ;
        // Create and write on json file in java
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Anusha");
        jsonObject.put("Roll num", "21SW004");
        jsonObject.put("Department", "Software");
        jsonObject.put("GPA", 3.59);
        try {
            FileWriter myFile=new FileWriter(filename);
            myFile.write(jsonObject.toJSONString());
            myFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read json file in java
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader myFile1 = new FileReader(filename);
            JSONObject jsonObj = (JSONObject) jsonParser.parse(myFile1);
            System.out.println(jsonObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}