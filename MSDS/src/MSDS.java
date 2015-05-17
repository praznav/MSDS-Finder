/**
*
* @author Pranav
*/
public class MSDS {
    String name;
    String MSDStext;
    public MSDS (String a) {
        name = a;
    }
   
    public String getText () {
        return MSDStext;
    }
   
    public void changeText(String a) {
        MSDStext = a;
    }
}
