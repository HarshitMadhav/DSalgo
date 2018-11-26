package dsalgo;

import java.beans.Transient;
import java.util.Locale;
import java.util.StringTokenizer;

public class practice{

    public static void main(String[] args){
        int a=12_3_4;
        System.out.println("String Tokenizer did this:");
        StringTokenizer si =  new StringTokenizer("Jai Shri Krishna!");
        while(si.hasMoreTokens())
            System.out.println(si.nextToken());

        String str = Integer.toString(a);
        System.out.println("Integer to string " +str);

        String s ="harshit";
        int c = s.length();
        System.out.println("length is "+c);
        String i = "is ...";
        String k = s.toUpperCase();
        String out = s.concat(k);
        System.out.println(" "+out);

        StringBuffer b =  new StringBuffer("Harshit");
        b.append("Agrawal");
        b.append("1000");
        b.reverse();  // reverse() can also be used wiht StringBuilder too as StringBuilder = new StringBuilder(str);
        System.out.println(b);

        String octalString = Integer.toOctalString(a);
        System.out.println("decimal to octal " +octalString);
        String binaryString = Integer
                .toBinaryString(a);
        System.out.println("decimal to binary "+ binaryString);
        String hexString = Integer.toHexString(a);
        System.out.println("decimal to hex "+hexString);

        String customBase = Integer.toString(a, 5);
        System.out.println("Decimal to custom radix is " +customBase);

        int aa =Integer.parseInt(String.valueOf(a));
        System.out.println("using parseInt() "+aa);

        String st = new String("Hello! This is Harshit");
        int searchSubstring = st.indexOf("is");
        System.out.println("Search a substring in a string "+searchSubstring);

        String lang = "I know you but you don't know me.";
        Locale Turkish = Locale.forLanguageTag("tr");
        String langConv = lang.toLowerCase(Turkish);
        System.out.println(langConv);

        //reverse a string
        char [] in = lang.toCharArray();
        for(int j=in.length-1; j>=0; j--){
            System.out.print(in[j]);
        }

        //The super keyword in java is a reference variable that is used to refer parent class objects.
        // The keyword “super” came into the picture with the concept of Inheritance
        // When a variable is declared with final keyword, it’s value can’t be modified
        //abstract is a non-access modifier in java applicable for classes, methods but not variables.
        // Abstract is used to achieve abstraction which is one of the pillar of Object Oriented Programming(OOP)
        // transient variables are important to meet security constraints
        // use this.getClass().getName() to get the class name of the object

     }
    }