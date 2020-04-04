/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 */// uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         */ //Use either of these methods for input

        /*/BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t=0; t<T; t++){
            int n = s.nextInt();
            
            int[][] matrix = new int[n][n];
            for(int i=0; i<n;i++){
                    for(int j=0; j<n; j++){
                        matrix[i][j] = s.nextInt();
                    }
            }
            int count=0;
               for(int i=0; i<n;i++){
                    for(int j=0; j<n; j++){
                        for(int x=i; x<n; x++){
                            for(int y=j; y<n; y++){
                                if(matrix[i][j]>matrix[x][y]) count++;
                            }
                        }
                    }
               }
            System.out.println(count);
        }


        


        // Writing output to STDOUT

        /* */

        // Write your code here

    }
}
