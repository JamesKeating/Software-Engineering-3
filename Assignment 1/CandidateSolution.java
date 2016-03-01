import java.util.*;

public class CandidateSolution {
	private Random rnd = new Random();
	private HashMap<String, CandidateAssignment> solutionMap = new HashMap<String, CandidateAssignment>();
	private Vector<CandidateAssignment> solutionList = new Vector<CandidateAssignment>();
	
	/*Creates a list and hashmap of assignments for every student in preference table 
	 * (list for returning rand student) (hashmap for returning a spcific student )
	 *@param preferences: a preference table which the candidate solution will be based on  */
	public CandidateSolution(PreferenceTable preferences){
		for (StudentEntry student : preferences.getAllStudentEntries()){	
			solutionList.add ( new CandidateAssignment(student));
			solutionMap.put (student.getStudentName() , solutionList.lastElement());
		}
	}
	
	public CandidateAssignment getAssignmentFor(String studentName){
		return solutionMap.get(studentName);
	}
	
	public CandidateAssignment getRandomAssignment(){
		return solutionList.get(rnd.nextInt(solutionList.size()));	
	}	
}