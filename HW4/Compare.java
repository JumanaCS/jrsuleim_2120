/**
 * @author Jumana Suleiman 
 */
public class Compare {
    /**
    * attack class that takes your pokemon's attack power and damages the other pokemon
    * @param s1 first string comparing
    * @param s2 second string comparing
    *ComparTo method that will compare 2 strings
    */
    public static int compare(final String s1, final String s2){
        /**
        * @return 0 if both lengths are 0
        * @return 1 if first string's length isn't 0
        * @return -1 if none of the conditions are met
        */
        if(s1.length() == 0 || s2.length() == 0){
            if((s1.length() == 0 && s2.length() == 0))
            return 0;
        else if (s1.length() != 0)
            return 1;
        else 
            return -1;
    }

        /**
        * @return -1 if first string's char is less than second string's char
        * @return 1 if first string's char is greater than second string's char
        * @return 0 if they're equal
        * @return the comparison between the two strings
        */ 
        if (s1.charAt(0) < s2.charAt(0)) 
            return -1;

        else if (s1.charAt(0) > s2.charAt(0)) 
            return 1;
        
        else if (s1.charAt(0) == s2.charAt(0)) 
            return 0;
        
        else 
            return compare(s1.substring(1), s2.substring(1));

    }

    public static int compare(final String s1, final String s2){
        return compare(s1,s2);
    }
    
    public static String findMinimum(final String[] stringArray, int numStrings) {
        String i = stringArray[0];
        for(String e : stringArray)
            if(compare(e, i) < 0)
                i = e;
        return i;
    }
}
