import java.util.ArrayList;
/**
*
* @author Pranav
*/
public class App {

    public static void main(String[] args) {

        try {

            String filename = args[0];
            ChemicalReader reader = new ChemicalReader(filename);
            ArrayList<String> chemicals = reader.getChemicalNames();

            MSDSCatalog catalog = new MSDSCatalog();
            MSDSWriter writer = new MSDSWriter();

            for (String chemical : chemicals) {
                MSDS msds = catalog.query(chemical);
                String text = msds.getText();
                writer.write(chemical, text);
            }
            writer.close();
           System.out.println("DONE");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: App [filename]");
            System.out.println(e.getMessage());
        }
    }
}
