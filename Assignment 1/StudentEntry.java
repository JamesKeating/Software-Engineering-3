import java.util.*;


public class StudentEntry {
	Vector <String> preferences = new Vector<String>();
	String name;
	int initial_num_of_pref = 0;
	boolean isPreassigned =false;
	
	
	StudentEntry(String input_name){
		name = input_name;
	}
	
	public String getStudentName(){
		return name;
	}
	
	public Vector<String> getOrderedPreferences(){
		return preferences;
	}
	
	public void preassignProject(String	pname){
		preferences.clear();
		addProject(pname);
		isPreassigned = true;
	}
	
	public boolean hasPreassignedProject(){
		return isPreassigned;
	}	
	
	public void setNumberOfStatedPreferences(){
		initial_num_of_pref = preferences.size();	
	}
	
	public int getNumberOfStatedPreferences(){
		return initial_num_of_pref;
	}
	
	public void addProject(String	pname){
		if (!isPreassigned){
			preferences.add(pname);
		}
	}
	
	//prints student for testing purposes 
	public void displayStudent(){
		System.out.print("\nStudent name: " + name+ "\nPreferences: " +  preferences + "\n");
	}

}
