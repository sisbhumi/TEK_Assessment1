package virtualkeyforrepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilesList {
	
	List<String> files = new ArrayList<String>();
	
	void addfile(String fileName) {
		files.add(fileName);
		System.out.println("File "+ fileName + " added successfully.");
	}
	
	void removefile(String fileName) {
		
		if(files.remove(fileName)) {
			System.out.println("File "+ fileName + " deleted successfully.");
		}
		else
			System.out.println("File not found.");
		
	}

	void show() {
		
		Collections.sort(files);
		
		
		if(files.isEmpty())
			System.out.println("You Directory is empty.");
		else {
			System.out.println("Files present in your Directory are: ");
			for( String file : files)
				System.out.println(file);
		}
	}
	
	void search(String fileName) {
		
		if(files.contains(fileName)) {
			System.out.println("File is present in your directory.");
		}
		else
			System.out.println("File Not Found.");
	}
	
}
