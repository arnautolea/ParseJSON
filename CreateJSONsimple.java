package mvn.ParsingJSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONsimple {

@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
    JSONObject company = new JSONObject();
   
    JSONObject department = new JSONObject();
    company.put("company", department);
 
    JSONArray depArray = new JSONArray();
    department.put("department", depArray);
    
    JSONObject depDescription = new JSONObject();
    depDescription.put("name","Development");
    depDescription.put("depId","1");
 
    depArray.add(depDescription);
     
    JSONArray empArray = new JSONArray();
    depDescription.put("employee", empArray);
      
    JSONObject empDescription = new JSONObject();
    empDescription.put("empId", "001");
    empDescription.put("lastname", "Washington");
    empDescription.put("firstname", "George");
    empDescription.put("birthDate", "February 22, 1732");
    empDescription.put("position", "First US President");
    empDescription.put("managerId", "0");
    
    empArray.add(empDescription);
    
    JSONObject skills = new JSONObject();
    empDescription.put("skills", skills);
    
    JSONArray skillArray = new JSONArray();
    skillArray.add("Powers of persuasion");
    skillArray.add("Ability to unify");
    skillArray.add("Empowering others");
    
    skills.put("skill", skillArray);
    

    try (FileWriter file = new FileWriter("kompashka.json")) {

        file.write(company.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.print(company);
}
}
