import java.util.*;

public class Strings {
    //Extract  a portion  of  the  string  and  print  it. 
    //Variable  m  indicates  the  amount  of characters to be extracted from the string starting from the nth position.
    static String extract(String s,int m,int n){
        return s.substring(n,n+m);
    }
    //Read a text and count all the occurrences of a particular word
    static int occurrences(String str,String word){
        int count =0;
        String a[] = str.split(" ");
        
        for(int i=0;i<str.length();i++){
            if(word.equals(a[i])){
                count++;
            }
        }
        return count;
        
        }
        //Replace a substring in the given string
        static String substring(String og,String target,String replacement){
            return og.replace(target, replacement);
            
        }
    public static String sort_string(String inputString)
	{
		char tempArray[] = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
    }
    //Compare two strings ignoring case
    static boolean compare(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    //concatenate
    static String Concat(String s1,String s2){
        return s1.concat(s2);
    }
    public static void main(String[] args) {
      
           System.out.println(compare("Hello","hello"));
    }
    }


