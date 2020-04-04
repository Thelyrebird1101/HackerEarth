/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner

        Scanner s = new Scanner(System.in);
        s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       String str = s.nextLine();
       int count=0, result=0;
       for(int i=0; i<str.length(); i++){
           if(isVowel(str.charAt(i))){
               count++;
           }
           else{
               result = Math.max(result, count);
               count=0;
           }
       }
       System.out.println(Math.max(result, count));
        // Write your code her
    }


    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c == 'o'|| c== 'u')
           return true;
        else return false;

    }
}
