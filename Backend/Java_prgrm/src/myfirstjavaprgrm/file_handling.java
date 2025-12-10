package myfirstjavaprgrm;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.*;

class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
    /* for hiding the warning God sake
    When Java serializes objects, it uses serialVersionUID to check compatibility between versions of the class.
    If you don't fix a UID yourself, Java auto generates one — Eclipse just warns you in case your class changes later.
     */
	
	
	String name;
    int age;
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class file_handling {

    public static void main(String[] args) {
    try {
        File myfileobject = new File("text_demo.txt");
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
        
         File myObj = new File("filename.txt");    //only deletes a file
         myObj.delete()
         
         File myObj = new File("C:\\Users\\MyName\\Test");      //deletes a folder
         myObj.delete()
        
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
        
       
        
        //file write using filewriter
        try (FileWriter file_writer = new FileWriter("text_demo.txt")){
        file_writer.write("Hey!! You will be Amazed when you find me in the file. \n");
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
        
        //Append
        try(FileWriter file_appender = new FileWriter("text_demo.txt",true)){   //dont forgot true if you then it will overwrite not appends
            file_appender.append("This is a new text appended by appender \n");
        }
        

        catch(IOException e) {
        System.out.println("Some error in file writer append");
        }
        
        
        
        
        //file read operation

        System.out.println("\n");
        // try-with-resources: Scanner will be closed automatically
        try (Scanner file_reader = new Scanner(myfileobject)) {
          while (file_reader.hasNextLine()) {      //hasnextline checks for the next line of the file
            String data = file_reader.nextLine(); 
            System.out.println(data);
          }
        } catch (FileNotFoundException e) {
          System.out.println("An File not found error occurred.");
          e.printStackTrace();
        }
        
          
    }
        
    catch(IOException e) {
        e.printStackTrace();
    }

    
    
    
    
    //iostreams
    System.out.println("\n");
    
    /*
    Stream classes (FileInputStream, FileOutputStream, FileReader, FileWriter)
    * Direct connection, raw flow.

    Buffered classes (BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter)
    * Wrap the base streams, store data in a buffer array, reduce disk hits, faster for bigger data.
    */
    
    
     /*
    Byte Streams--Use when you work with raw data: images, audio, PDFs, etc.
    Classes : FileInputStream – read bytes from a file,FileOutputStream – write bytes to a file

    Character Streams--Use when you work with text (characters), like .txt, .java.
    Classes : FileReader, FileWriter,BufferedReader, BufferedWriter
    */
    

    //InputStream / Reader → read from file (in stream = incoming data)
    //OutputStream / Writer → write to file (out stream = outgoing data)
  
     
    
    /* stream vs buffered
     * 
| Aspect                    | Stream Classes (FileInputStream, FileReader, etc.) | Buffered Classes (BufferedInputStream, BufferedReader, etc.) |
| ------------------------- | -------------------------------------------------- | ------------------------------------------------------------ |
| Speed                     | Slower — interacts with disk every read/write      | Faster — stores chunks in RAM & sends to disk in batches     |
| Disk Access               | Every byte/char = disk hit                         | Reads/writes multiple bytes/chars at once                    |
| Use Case                  | Small files, quick simple operations               | Large files, loops, heavy I/O, backend apps                  |
| Memory Use                | No extra memory besides basic buffer               | Uses internal buffer array (default 8KB)                     |
| Performance Impact        | CPU waits more → laggy                             | CPU uses buffer → smooth I/O                                 |
| Read/Write Style          | byte-by-byte / char-by-char                        | chunked reading / line-based                                 |
| Latency                   | Higher                                             | Lower                                                        |
| Flush Needed?             | Mostly auto-written                                | Should flush manually for output streams                     |
| Try-with-resources        | Recommended but ok without                         | Highly recommended                                           |
| Example File Size         | 1KB OK                                             | 1MB+ mandatory                                               |
| Scanner/PrintWriter Combo | Works but slower                                   | Faster + more scalable                                       |
| Common Use                | quick demos                                        | backend logging, network reads, large config files           |

     */
    
    
    
    
    /*basic vs buffered byte stream
     * 
| Feature          | FileInput/OutputStream | BufferedInput/OutputStream               |
| ---------------- | ---------------------- | ---------------------------------------- |
| Operates on      | Binary (bytes)         | Binary (bytes)                           |
| Performance      | Slow                   | Fast                                     |
| Disk Calls       | Per byte read/write    | Read/write multiple bytes at once        |
| Internal Buffer  | ❌ No buffer           | ✔ Yes buffer                             |
| When to Use      | Tiny binary data       | Large byte files (images, docs, uploads) |
| Efficiency       | Low                    | High                                     |
| Typical Use Case | quick operations       | backend API file transfers               |

     */
    
    
    
    /*basic vs buffered char streams
| Feature        | FileReader / FileWriter | BufferedReader / BufferedWriter |
| -------------- | ----------------------- | ------------------------------- |
| Operates On    | text/characters         | text/characters                 |
| Speed          | slower                  | faster                          |
| Reading Style  | one char at a time      | full line reading possible      |
| Writing Style  | direct                  | buffered chunks                 |
| Extra Features | basic                   | `.readLine()` + `.newLine()`    |
| Best For       | tiny text files         | big configs, logs, parsers      |

     */
    
    
    
    
    
    /*
     * stream all classes with read write codes
| Class                                | Works On                | Raw/Formatted            | Writes Readable Text? | Typical Use                 |
| ------------------------------------ | ----------------------- | ------------------------ | --------------------- | --------------------------- |
| FileInputStream                      | bytes                   | raw                      | ❌                     | read binary file            |
| FileOutputStream                     | bytes                   | raw                      | ❌                     | write binary file           |
| FileReader                           | characters              | raw                      | ✔                     | read plain text file        |
| FileWriter                           | characters              | raw                      | ✔                     | write plain text file       |
| DataInput/OutputStream               | bytes but structured    | formatted for primitives | ❌ (binary)            | saving ints/floats/booleans |
| ObjectInput/OutputStream             | bytes but object format | formatted for objects    | ❌                     | reading/writing objects     |
| InputStreamReader/OutputStreamWriter | converts bytes↔chars    | depends                  | ✔                     | encoding control, sockets   |
| PrintWriter                          | characters              | formatted                | ✔✔                    | logging, formatted writing  |

     */ 
     System.out.println("Stream classess");
     System.out.println("\n");
    
    
     // basic byte stream demo → append readable text into same text file
     try (FileOutputStream fos = new FileOutputStream("text_demo.txt", true)) {
         fos.write("Written by Fileopstream\n".getBytes());
     } catch (IOException e) { e.printStackTrace(); }

     
     try (FileInputStream fis = new FileInputStream("text_demo.txt")) {
         int b;
         while((b = fis.read()) != -1) System.out.print((char)b);//0 to 255 bytes only valid ; -1 not valid
         System.out.println();                         //byte to char conversion
     } catch (IOException e) { e.printStackTrace(); }

     
   
     
     System.out.println("\n");
     //using filewriter
     try (FileWriter file_writer = new FileWriter("text_demo.txt",true)){
        file_writer.write("Written by filewriter\n");
     }catch(IOException e) { e.printStackTrace();}
      
     
     //using filereader
     try (FileReader fr = new FileReader("text_demo.txt")) {
         int c;
         while ((c = fr.read()) != -1) System.out.print((char) c);
         System.out.println();
     } catch (IOException e) { e.printStackTrace(); }
     
   
   
     
     System.out.println("\n");
     // DataOutputStream / DataInputStream on a separate binary file
     try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data_demo.bin"))) {
         dos.writeInt(10);        //like inputstream u dont need to convert manually
         dos.writeDouble(99.9);
     } catch (IOException e) { e.printStackTrace(); }

     try (DataInputStream dis = new DataInputStream(new FileInputStream("data_demo.bin"))) {
         System.out.println(dis.readInt());    //you should not change the order of reading 
         System.out.println(dis.readDouble());
     } catch (IOException e) { e.printStackTrace(); }

     
    
     System.out.println("\n");
     //serialize-Convert object → bytes and store in file 
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.obj"))) {    // Creates/opens file to write bytes  // Wrapper stream that writes objects
         oos.writeObject(new User("Karthik", 22));// Converts User object into bytes and writes into file
     } catch (IOException e) {e.printStackTrace();}

     //Deserialization-Read bytes → rebuild the object 
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.obj"))) {   // Wrapper stream capable of reading objects   // Opens file that contains serialized object bytes
         User u = (User) ois.readObject();               // Reads bytes + reconstructs the actual User object (needs casting)
         System.out.println(u.name + " " + u.age);       // Uses the restored object normally
     } catch (IOException | ClassNotFoundException e) {e.printStackTrace();}

     
    
     System.out.println("\n");
     // UTF-8 bridge demo, same text file, append
     try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text_demo.txt", true), "UTF-8")) { //"OutputStreamWriter & InputStreamReader = bridge between byte streams and character streams." FileOutputStream / FileInputStream → work with bytes and Writer / Reader → work with characters (text).  so These two classes are like translators:chars ↔ bytes using some encoding (here: UTF-8)
         osw.write("UTF Stream Write\n");    // Take this String, convert each char to bytes using UTF-8, write to file
     } catch (IOException e) { e.printStackTrace(); }

     try (InputStreamReader isr = new InputStreamReader(new FileInputStream("text_demo.txt"), "UTF-8")) {  // FileOutputStream writes raw bytes to file "Filename.txt"    // Use UTF-8 encoding to convert chars -> bytes
         int ch;
         while ((ch = isr.read()) != -1) System.out.print((char) ch);  //0 to 255 bytes only valid ; -1 not valid   // cast int -> char for display (we print each character to console)
         System.out.println();
     } catch (IOException e) { e.printStackTrace(); }


     
     System.out.println("\n");
     //printwriter
     try (PrintWriter pw = new PrintWriter(new FileWriter("text_demo.txt", true))) {
         pw.println("LOG: Hello PrintWriter Feature");
     } catch (IOException e) { e.printStackTrace(); }

     
     
     
     
     /*
      * buffer all classes with read and write codes
| Class                           | Works On    | Raw/Formatted | Has Internal Buffer?               | Boosts Performance?            | Typical Use Case                                 |
| ------------------------------- | ----------- | ------------- | ---------------------------------- | ------------------------------ | ------------------------------------------------ |
| **BufferedInputStream**         | bytes       | raw           | ✔                                  | ✔ Especially big reads         | wrapping FileInputStream for fast reading binary |
| **BufferedOutputStream**        | bytes       | raw           | ✔                                  | ✔ especially many small writes | wrapping FileOutputStream for fast binary writes |
| **BufferedReader**              | characters  | raw           | ✔                                  | ✔ huge for line-wise text read | reading text files line-by-line                  |
| **BufferedWriter**              | characters  | raw           | ✔                                  | ✔ batching text before writing | writing text efficiently                         |
| **PrintWriter (Buffered-like)** | characters  | formatted     | ✔ (optional autoflush)             | ✔ formatting + buffer          | logging, writing readable formatted text         |
| **InputStreamReader + Buffer**  | bytes→chars | depends       | ✔ when wrapped with BufferedReader | ✔ encoding + speed             | reading text from sockets/file streams           |
| **OutputStreamWriter + Buffer** | chars→bytes | depends       | ✔ when wrapped with BufferedWriter | ✔ encoding + speed             | writing encoded text efficiently                 |

      */

     System.out.println("Buffered classes");
     System.out.println("\n");
     

     //BufferedOutputStream + FileOutputStream
     try (BufferedOutputStream bos =
                  new BufferedOutputStream(new FileOutputStream("buff_demo.txt"))) {
         bos.write(("Hey from buffered class\nWritten by buff op stream").getBytes());
     } catch (IOException e) { e.printStackTrace(); }

     //BufferedInputStream + FileInputStream
     try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("buff_demo.txt"))) {
         int byteData;
         while ((byteData = bis.read()) != -1)
             System.out.print((char) byteData);
         System.out.println();
     } catch (IOException e) { e.printStackTrace(); }

     
     
     System.out.println("\n");
     //BufferedWriter + FileWriter
     try (BufferedWriter bw = new BufferedWriter(new FileWriter("buff_demo.txt", true))) {
         bw.newLine();
         bw.write("Written by buff writer+file writer");
         bw.newLine();
         bw.write("Second line rocks!");
     } catch (IOException e) { e.printStackTrace(); }

     //BufferedReader + FileReader
     try (BufferedReader br = new BufferedReader(new FileReader("buff_demo.txt"))) {
    	 String line;
         while ((line = br.readLine()) != null)
             System.out.println(line);
     } catch (IOException e) { e.printStackTrace(); }

     
     
     System.out.println("\n");
     //PrintWriter chained over BufferedWriter
     try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("buff_demo.txt",true)))) {
         pw.println("INFO: Buffered Logging Works!");
         pw.printf("FORMAT: %s = %d%n", "count", 10);
     } catch (IOException e) { e.printStackTrace(); }

    


	
	
        
	}

}
	
