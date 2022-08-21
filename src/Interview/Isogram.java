package Interview;

import java.util.HashSet;
import java.util.Set;

//check if a string is Isogram or nt
/*
* This is a function problem.you only need to complete the function isIsogram() that takes a String as a parameter and
* returns either true or false
* Isogram  String: String that doen not contains  duplicate character
* */
public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("codedecode"));

    }
    static boolean isIsogram(String s){
     boolean isogram=true;
        char[] ch=s.toCharArray();
        Set<Character> chSet=new HashSet<>();
        for (Character c:ch){
            if (chSet.contains(c)){
                isogram=false;
            }else {
                chSet.add(c);
            }
        }
    return isogram;
    }
}
