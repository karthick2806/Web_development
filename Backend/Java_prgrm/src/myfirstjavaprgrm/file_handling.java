package myfirstjavaprgrm;
import java.io.File;
import java.io.IOException;


public class file_handling {

	public static void main(String[] args) {
	try {
		File myfileobject = new File("Filename.txt");
	    myfileobject.createNewFile();       //File myfileObject = new File("C:\\Users\\MyName\\filename.txt");     can also create a file in specific location
	    
	    System.out.println("Exists? " + myfileobject.exists());
	    
	    // Get info
        System.out.println("Name: " + myfileobject.getName());
        System.out.println("Path: " + myfileobject.getAbsolutePath());
        System.out.println("Is file? " + myfileobject.isFile());
        System.out.println("Is directory? " + myfileobject.isDirectory());

        // Delete the file
        // boolean deleted = file.delete();
        // System.out.println("File deleted? " + deleted);
	    
        
        
        //file write
        /*
        Byte Streams--Use when you work with raw data: images, audio, PDFs, etc.
        Classes : FileInputStream – read bytes from a file,FileOutputStream – write bytes to a file

        Character Streams--Use when you work with text (characters), like .txt, .java.
        Classes : FileReader, FileWriter,BufferedReader, BufferedWriter
        */
        
        
        
        
        
        
        
	
	}
		
	catch(IOException e) {
		e.printStackTrace();
	}

	}

}
