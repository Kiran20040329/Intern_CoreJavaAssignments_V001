package Interns_CoreJavaAssignments_V001;

import java.io.*;

public class FileContentDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("sample.txt");
        BufferedReader reader= null;
        try {
        	reader= new BufferedReader(new FileReader(file));
        	System.out.println("File content: ");
        	String line;
        	while ((line=reader.readLine())!=null) {
        		System.out.println(line);
        	}
        }
        catch(FileNotFoundException e) {
        	System.out.println("Enter: File not found.");
        }
        catch(IOException e) {
        	System.out.println("Error: An IO error occured.");
        }
        finally {
        	try {
        		if(reader!=null) {
        			reader.close();
        	}
        	System.out.println("File operation completed.");
        	
        }
        catch(IOException e) {
        	System.out.println("Error: Unable to close the file.");
        }
	}
	}
}
