import java.io.*;
/*
* @author Pranav
* @version 1.2
* 
* Generate output text files in a sub-directory
*/
public class MSDSWriter {
    FileWriter fstream;
    BufferedWriter out;
    public MSDSWriter () {
        try {
            fstream = new FileWriter("output.doc");
            out = new BufferedWriter(fstream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Writes a single chemical and its MSDS
     * @param chemical		-- chemical name
     * @param text			-- MSDS text
     */
    public void write(String chemical, String text) {
        try {
            out.append(chemical.replace('+', ' '));
            out.newLine();
            out.append("__________");
            out.newLine();
            out.append(text);
            out.append((char)12);
            out.newLine();
            out.newLine();
            out.newLine();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * closes the file writer
     */
    public void close() {
        try {
        	out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
