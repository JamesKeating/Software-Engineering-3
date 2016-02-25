import java.io.*;

public class Main {

	//loads test file to a table and prints for testing purposes 
	public static void main(String[] args) {
		String filename = "Data"+File.separator+"Project_allocation_data.tsv";
		PreferenceTable test = new PreferenceTable(filename);
		test.getAllStudentEntries().get(0).displayStudent();
		test.getEntryFor("Alan Turing").displayStudent();

		//testing preassigned
		System.out.print("\nExpected value true: "+test.getEntryFor("Uriah Heap").hasPreassignedProject());
		
		//testing search for non exsistant key
		System.out.print("\nExpected value true: " +( test.getEntryFor("xxx") == null));
		
		
		int target = test.getAllStudentEntries().size();
		
		// checks all students have 10 preferences if not preassigned after fillPreferences is called 
		int count = 0;
		test.fillPreferencesOfAll(10);
		for ( StudentEntry student: test.getAllStudentEntries()){
			if (student.getOrderedPreferences().size() == 10 || student.hasPreassignedProject()){
				count += 1;
			}
		}
		System.out.print("\nIf true all preferences are full:  " + (count == target));
		
	}
}
