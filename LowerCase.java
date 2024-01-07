/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        int length = str.length();
        System.out.println(lowerCase(str, length));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s, int length) {
       String output = "";
        int i = length;
        for (int index = 0; index < length; index++) {
           if (65<=s.charAt(index) && s.charAt(index)<=90) {
            output = output + (char)(s.charAt(index) + 32);
           } else {
            output = output + s.charAt(index);
            } 
           }   

        return output;
    }
}
