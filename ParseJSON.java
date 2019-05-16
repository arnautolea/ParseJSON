package mvn.ParsingJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParseJSON {
	public static void main(String[] args) {
		// Create parser
		JSONParser parser = new JSONParser();
	try {
		// Read file and create it's object
		Object obj = parser.parse(new FileReader("company123.json")); 
		// Convert object to JSONObject
		JSONObject jsonObject = (JSONObject) obj;
		System.out.println(jsonObject); //Output object as a string
		// Create company's array
		JSONArray company = (JSONArray) jsonObject.get("company");
		// Loop company and get departments
		for (int c = 0; c < company.size() ; c++) {
			System.out.println("-------company-------");
			JSONObject eachCom =  (JSONObject) company.get(c);
			JSONArray department = (JSONArray) eachCom.get("department");
			// Loop departments to get values for name, depId and create emplyee's array
			for (int d = 0; d < department.size() ; d++) {
				System.out.println("\n-----department-----");
				JSONObject eachDep =  (JSONObject) department.get(d);

				String name = (String) eachDep.get("name");
				System.out.println("Name: " + name);

				String depId = (String) eachDep.get("depId");
				System.out.println("depId: " + depId);

				JSONArray employee = (JSONArray) eachDep.get("employee");

				//Loop employees and get values for each employee
				for (int e = 0; e < employee.size() ; e++) {
					System.out.println("\n-------employee-------");
					JSONObject eachEmp =  (JSONObject) employee.get(e);

					String empId = (String) eachEmp.get("empId");
					System.out.println("empId: " + empId);

					String lastname = (String) eachEmp.get("lastname");
					System.out.println("lastname: " + lastname);

					String firstname = (String) eachEmp.get("firstname");
					System.out.println("firstname: " + firstname);

					String birthDate = (String) eachEmp.get("birthDate");
					System.out.println("birthDate: " + birthDate);

					String position = (String) eachEmp.get("position");
					System.out.println("position: " + position);
					
					// Object "skills" contain "skill" array
					System.out.println("skills:");
					JSONObject skills = (JSONObject) eachEmp.get("skills");
					JSONArray skill = (JSONArray) skills.get("skill");
					// Create iterator for reading skill's value
					@SuppressWarnings("unchecked")
					Iterator<String> iterator = skill.iterator();
					while (iterator.hasNext()) {
						System.out.println("skill: " + iterator.next());
					}
					String managerId = (String) eachEmp.get("managerId");
					System.out.println("managerId: " + managerId);
				}//for employee
			}//for department
		}//for company
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e2) {
	    e2.printStackTrace();
	} 
    }//main
}//class
