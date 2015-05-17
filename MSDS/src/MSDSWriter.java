import java.io.*;
/*
* @author Pranav
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
    public void close() {
        try {
        	out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
