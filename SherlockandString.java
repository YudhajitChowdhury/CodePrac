import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        int [] a = new int [26];
        int min =0;
        int max = 0;
        int c=0;
        HashSet <String> set = new HashSet();

        for(int i=0;i<s.length();i++){
                char current_char = s.charAt(i);
                int char_to_int = (int)current_char;

                int position = char_to_int - (int)'a';

                a[position]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                min=max=a[i];
                break;
            }

        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min = a[i];
            }
        }
        if(max>min){
        if(max-1==min){
            
                return "NO"; 
            //return "YES";
        }
        else
            return "NO";
        }
        else
            return"YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
