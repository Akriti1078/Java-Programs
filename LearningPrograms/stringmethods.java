package LearningPrograms;

import java.sql.SQLOutput;

public class stringmethods {
    public static void main(String[] args) {
        String name = "AKRITI";
        //System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String nontrimmedstring = "       AKRITI     ";
        System.out.println(nontrimmedstring);
        String trimmedstring = "    AKRITI    ";
        System.out.println( trimmedstring.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(3,6));
        System.out.println(name.replace( 'R','T'));
        System.out.println(name.replace ( "I", "IISCUTE"));
        System.out.println(name.startsWith("AKR"));
        System.out.println(name.endsWith("AKR"));

        //System.out.println(name.charAt(4));
        //String modifiedname = "AKRITITITI";
        //System.out.println(modifiedname.indexOf("ITI"));
        //System.out.println(modifiedname.indexOf("TI,3"));
       // System.out.println(modifiedname.lastIndexOf("ITI",6));
        System.out.println(name.equals("AKRITI"));
        System.out.println(name.equalsIgnoreCase("akriti"));
        System.out.println("i am   \n  Akriti " );






        

    }
}
