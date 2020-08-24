import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d, int n) {
        int temp=0;
        /*while(d>0){
            for(int i=0;i<a.length;i++){
                if(i==0){
                    temp = a[i];
                }
                else if(i==a.length-1){
                    a[i-1]=a[i];
                    a[i]=temp;
                }
                else{
                    a[i-1]=a[i];
                }
                
            }
            d--;
            

        }*/
        int [] arr = new int [n];
        int i=0;
        int rotated_index=d;

        while(rotated_index<n){
            arr[i]=a[rotated_index];
            rotated_index ++;
            i++;
        }

        rotated_index=0;

        while(rotated_index<d){
            arr[i]=a[rotated_index];
            rotated_index ++;
            i++;
        }
        
        return arr;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int a[] = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d,n);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
