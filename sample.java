import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sample
 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int i;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N!=0){
            N=N+1/2;
            System.out.println("Weird:"  + N);
        }
        for(i=2;N<=5;i++){
            N=N+1/2;
            System.out.println(N);
            N=N/2;
            System.out.println(N);
            System.out.println("Not Weird");
        }
        if(N>=6 && N<=20){
            N=N+1/2;
            System.out.println("Weired");
        }
        
        scanner.close();
    }
}