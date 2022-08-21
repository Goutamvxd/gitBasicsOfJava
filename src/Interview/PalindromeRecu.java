package Interview;
// A recursive JAVA program to
// check whether a given String
// is palindrome or not

public class PalindromeRecu {

    /*package whatever //do not write package name here */

        public static boolean isPalindrome(String s, int i){
            if(i > s.length()/2)
            {
                return true ;
            }

            return s.charAt(i) == s.charAt(s.length()-i-1) && isPalindrome(s, i+1) ;

        }

        public static void main (String[] args) {
            String str = "geeg" ;
            if (isPalindrome(str, 0))
            { System.out.println("Yes"); }
            else
            { System.out.println("No"); }

        }
    }

// This code is contributed by akashish.







