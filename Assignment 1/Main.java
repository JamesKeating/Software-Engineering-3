import java.io.*;

public class Main {

	//loads test file to a table and prints for testing purposes 
	public static void main(String[] args) {
		String filename = "Data"+File.separator+"Project_allocation_data.tsv";
		PreferenceTable test = new PreferenceTable(filename);
		test.fillPreferencesOfAll(10);
		CandidateSolution testSolution = new CandidateSolution(test);
		System.out.println("\nrandom assign:\t "+testSolution.getRandomAssignment());
		System.out.println("\ninitial assign:\t "+testSolution.getAssignmentFor("Ali G"));
		testSolution.getAssignmentFor("Ali G").randomizeAssignment();
		System.out.println("\nnew assign:\t "+testSolution.getAssignmentFor("Ali G"));
		testSolution.getAssignmentFor("Ali G").undoChange();
		System.out.println("\nundo get old assign:\t "+testSolution.getAssignmentFor("Ali G"));
		
		
		
	}
}
