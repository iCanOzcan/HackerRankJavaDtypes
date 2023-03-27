import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.print("please enter the number for number of test: ");
        int t =can.nextInt();
        for(int i =0; i<t; i++){
            try{
                System.out.print("please enter the number to check:");
                long x = can.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x>= Byte.MIN_VALUE && x<= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(x>= Short.MIN_VALUE && x<= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(x>= Integer.MIN_VALUE && x<= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(x>= Long.MIN_VALUE && x<= Long.MAX_VALUE){
                    System.out.println("* long");
                }

            }catch(Exception e){
                System.out.println(can.next()+" can't be fitted anywhere." );
            }

        }
    }
}