package com.shevlik.Topic8;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();
        str=str.trim();
        char[] punctuationMarks={',','.',';',':','!'};
        String[] strArray=str.split("[,.;:!? ]+");
        String result="";
        int i=0;
        for (String str3:strArray) {
            result+=str3.charAt(str3.length()-1);
        }
        System.out.println("New: "+result);
        in.close();
    }
}
