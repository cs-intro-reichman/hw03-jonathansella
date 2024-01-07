/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s1String) {
        String s = "";
     for (int i = 0; i < s1String.length(); i++) {
        if (s1String.charAt(i) == 32) {
            s = s + (char) 32;
        } else if (s.indexOf(s1String.charAt(i)) == -1) {
            s = s + s1String.charAt(i);
        } 

        }
         return s;
        }
        
    }

