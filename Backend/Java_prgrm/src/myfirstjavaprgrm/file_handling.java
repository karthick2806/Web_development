package myfirstjavaprgrm;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class file_handling {

	public static void main(String[] args) {
	try {
		File myfileobject = new File("Filename.txt");
	    myfileobject.createNewFile();       //File myfileObject = new File("C:\\Users\\MyName\\filename.txt");     can also create a file in specific location
	    
	    
	    /*
	     * Small try block for if the file actually got created
	     * 
	    try {
            boolean created = file.createNewFile(); // tries to create

            if (created) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error while creating file: " + e.getMessage());
	    */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("Exists? " + myfileobject.exists());
	    
	    // Get info
        System.out.println("Name: " + myfileobject.getName());
        System.out.println("Path: " + myfileobject.getAbsolutePath());
        System.out.println("Is file? " + myfileobject.isFile());
       
        
        
        
        /*
        Another useful examples are
        
         File file = new File("demo.txt");

        System.out.println("======= BASIC INFO =======");
        System.out.println("Name: " + file.getName());                     // File name
        System.out.println("Path: " + file.getPath());                      // Relative path
        System.out.println("Absolute Path: " + file.getAbsolutePath());     // Full OS path
        System.out.println("Canonical Path: " + file.getCanonicalPath());   // Resolved path
        System.out.println("Parent: " + file.getParent());                  // Parent directory

        System.out.println("\n======= TYPE CHECK =======");
        System.out.println("Exists? " + file.exists());                     // Returns true if file exists
        System.out.println("Is file? " + file.isFile());                    // true if it's a file
        System.out.println("Is directory? " + file.isDirectory());          // true if it’s a folder
        System.out.println("Is hidden? " + file.isHidden());                // Hidden status
        System.out.println("Is absolute? " + file.isAbsolute());            // Path type

        System.out.println("\n======= PERMISSION CHECKS =======");
        System.out.println("Readable? " + file.canRead());                  // Permission Read
        System.out.println("Writable? " + file.canWrite());                 // Permission Write
        System.out.println("Executable? " + file.canExecute());             // Permission Exec

        System.out.println("\n======= CREATION =======");
        System.out.println("Creating file: " + file.createNewFile());       // Create file

        // Directory creation
        File folder = new File("MyFolder");
        System.out.println("Created folder? " + folder.mkdir());            // Single folder
        File nested = new File("A/B/C");
        System.out.println("Created nested dirs? " + nested.mkdirs());      // Multiple folders

        System.out.println("\n======= SIZE & MODIFIED =======");
        System.out.println("Size (bytes): " + file.length());               // File size
        System.out.println("Last modified: " + file.lastModified());        // Last edit time

        System.out.println("\n======= DIRECTORY LISTING =======");
        File current = new File(".");
        File[] contents = current.listFiles();                              // List current folder contents
        for (File f : contents) {
            System.out.println("Child: " + f.getName());
        }

        System.out.println("\n======= RENAME / MOVE =======");
        File renamed = new File("renamed_demo.txt");
        System.out.println("Renamed? " + file.renameTo(renamed));           // Rename

        System.out.println("\n======= DELETE =======");
        System.out.println("Deleted file? " + renamed.delete());            // Delete renamed file
        System.out.println("Deleted folder? " + folder.delete());           // Delete folder (only empty ones)
        
         */
        
        
        /*
        
        methods comparison table
        
| Method               | Description                           | When To Use                            |
| -------------------- | ------------------------------------- | -------------------------------------- |
| `getPath()`          | Returns the path given in constructor | When you want original input path      |
| `getAbsolutePath()`  | Full OS path                          | For printing readable full location    |
| `getCanonicalPath()` | Clean version removing `.` or `..`    | When resolving actual file system path |
| `exists()`           | Checks if file/folder actually exists | Before create/delete/read/write        |
| `isFile()`           | True if object is file                | Validating type                        |
| `isDirectory()`      | True if object is folder              | Folder operations                      |
| `canRead()`          | Read permission                       | File scan                              |
| `canWrite()`         | Write permission                      | Editing                                |
| `canExecute()`       | Execute permission                    | Running scripts                        |
| `length()`           | File size in bytes                    | File analyzer                          |
| `lastModified()`     | Timestamp of last edit                | Syncing / logging                      |
| `renameTo(..)`       | Rename/move file                      | Cut & paste / renaming                 |
| `delete()`           | Removes file/folder                   | Cleanup                                |
| `list()`             | Names inside folder                   | Quick folder listing                   |
| `listFiles()`        | File objects inside folder            | Deep inspection                        |



mkdirs and mkdir

| Method     | Creates                     | Usage                                 |
| ---------- | --------------------------- | ------------------------------------- |
| `mkdir()`  | Only **one folder**         | When parent directory already exists  |
| `mkdirs()` | All required nested folders | When intermediate folders don’t exist |

        
    
list and listfiles

| Feature | list()        | listFiles()                          |
| ------- | ------------- | ------------------------------------ |
| Returns | `String[]`    | `File[]`                             |
| Info    | Only names    | Full file objects                    |
| Usage   | Display names | Analyze attributes / delete / rename |

        
Absolute and Canonical path

| Absolute                                 | Canonical               |
| ---------------------------------------- | ----------------------- |
| Shows exact full path                    | Same but cleaned        |
| Might include symbols like `./` or `../` | Resolves them           |
| No symbolic link resolution              | Resolves symlinks       |
| Faster                                   | Reliable for validation |
        
        
        
         */
        
        
        
        
        
        
        //file write operations
        
        /*
        Byte Streams--Use when you work with raw data: images, audio, PDFs, etc.
        Classes : FileInputStream – read bytes from a file,FileOutputStream – write bytes to a file

        Character Streams--Use when you work with text (characters), like .txt, .java.
        Classes : FileReader, FileWriter,BufferedReader, BufferedWriter
        */
        
 
        //InputStream / Reader → read from file (in stream = incoming data)
        //OutputStream / Writer → write to file (out stream = outgoing data)
      
         
        try (FileWriter file_writer = new FileWriter("Filename.txt")){
        file_writer.write("Hey!! You will be Amazed when you find me in the file");
        //file_writer.close();   no needed when you are using try with resource
        }
        
        catch(IOException e) {
        System.out.println("Some error in try with resource");
        }
        
        
        /*
        Since Java 7, you can use try-with-resources. It is a special form of try that works with resources (like files and streams). 
        The resource is declared inside parentheses try(...)
        Java will close it automatically when the block finishes - even if an error occurs.
        */
        
        try(FileWriter file_appender = new FileWriter("Filename.txt")){
        	file_appender.append("This is a new text appended by appender");
        }
        

        catch(IOException e) {
        System.out.println("Some error in file writer append");
        }
        
        
        
        
        
        //file read operation

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        
        
        
	
	}
		
	catch(IOException e) {
		e.printStackTrace();
	}

	}

}
