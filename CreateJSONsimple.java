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
    JSONArray depArray = new JSONArray();
	JSONObject depDescription = new JSONObject();
    JSONArray empArray = new JSONArray();
    JSONObject empDescription = new JSONObject();
    JSONObject skills = new JSONObject();
    JSONArray skillArray = new JSONArray();
  
 
    company.put("company", department);
    
    department.put("department", depArray);
    
    depArray.add(depDescription);
    depDescription.put("-name","Development");
    depDescription.put("-depId","1");
    depDescription.put("employee", empArray);
    
    empArray.add(empDescription);    
    empDescription.put("-empId", "001");
    empDescription.put("lastname", "Washington");
    empDescription.put("firstname", "George");
    empDescription.put("birthDate", "February 22, 1732");
    empDescription.put("position", "First US President");
    empDescription.put("skills", skills);
    
    skills.put("skill", skillArray);
    skillArray.add("Powers of persuasion");
    skillArray.add("Ability to unify");
    skillArray.add("Empowering others");
    empDescription.put("managerId", "0");
      

    try (FileWriter file = new FileWriter("kompashka.json")) {

        file.write(company.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.print(company);

}

}
