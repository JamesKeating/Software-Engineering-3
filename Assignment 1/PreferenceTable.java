import java.io.*;
import java.util.*;

public class PreferenceTable {
	Vector<Vector<String>> table = null;
	
	public PreferenceTable(String filename){
		 table = loadContentFromFile(filename);	
	}
	 
	public PreferenceTable() {
		
	}
	
	/*Adds a series of string tokens to a vector, which then in turn is added as an element of the targetTable
	 *@param tokens: series of string tokens to be added
	 *@param targetTable: a vector of string vectors which tokens are too be added to
	 */
	private void addTokensToTable(StringTokenizer tokens, Vector<Vector<String>> targetTable){
		Vector<String> tableElement = new Vector<String>();
		
		while (tokens.hasMoreTokens()){	
			tableElement.add(tokens.nextToken());	
		}
		targetTable.add(tableElement);
	}
	
	/*Reads a file  and converts its text to a preference table.  
	 * Each line is converted to a vector of strings and then stored in a 2d vector to form the preference table
	 * @param filename: target file to be converted (must be tabs deliminated)
	 * @return: 2d vector of string vectors forming preference table
	 * */
	private Vector<Vector<String>> loadContentFromFile(String filename){
		Vector<Vector<String>> fileTable = new Vector<Vector<String>>();
		BufferedReader bufferedFile = FileIO.bufferFile(filename);
		String currentLine = FileIO.nextLine(bufferedFile);
					
		while (currentLine != null) {
			
			StringTokenizer tokens = new StringTokenizer(currentLine,	"\t");
			addTokensToTable(tokens, fileTable);
			currentLine =  FileIO.nextLine(bufferedFile);
		}
		return fileTable;
	}
	
	//prints table for testing purposes 
	public void displayTable(){
		for (int i = 0; i < table.size(); i++){
			System.out.println(table.get(i));
		}		
	}
	
}
