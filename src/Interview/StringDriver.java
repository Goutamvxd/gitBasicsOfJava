package Interview;

public class StringDriver {
    public static void main(String[] args) {
        String str1="Abc";
        String str2="Abc";
        String str3=new String("Abc");
        String str4=new String("abc");

        System.out.println(str1==str2);     //== compares content as well as address
        System.out.println(str1==str3);     //str1 is literal object present in string constant pool
        // str3 object present in heap  ;comparing str1 and str3 will give false

        System.out.println(str1.equals(str2));  //equals check for the content
        //str1.equals(str2)-----give true output

        System.out.println(str1.equals(str4));      //.equlas check the content str1="Abc" and str4="abc";
        //there for it will give false


        //ignoring case sentiveness  ---equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str4)); //ignoring the case sensitiveness
        //output will be true in this case
}
}
