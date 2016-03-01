import java.util.*;

public class CandidateAssignment {
	private StudentEntry candidate = null;
	private Stack<String> assignments = new Stack<String>();
	
	public CandidateAssignment(StudentEntry student){
		candidate = student;
		randomizeAssignment();	
	}
	
	public void randomizeAssignment(){	//add most recent assignment to top of stack 
		assignments.push(candidate.getRandomPreference());		
	}
	
	public void undoChange(){
		if (assignments.size() >1)	// must always have at least one non null assignment
			assignments.pop();	//removes assignment from top of stack
	}
	
	public String getAssignment(){
		return assignments.peek();
	}
	
	public StudentEntry getStudent(){
		return candidate;
	}
	
	public String toString(){	// string repersenting student and his currently assignment
		return candidate.getStudentName() +" was assigned: < "+ getAssignment() + " >";
	}
}