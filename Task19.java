package com.shevlik.Topic8;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();
        String str2=str.trim();
        int count;
        int p=0;
        int p0;
        if(str!=null && str.length()!=0) count=1;
        else count=0;
        while (p!=-1){
            p0=p;
            p=str2.indexOf(' ',p);
            if(p==1) p0=-1;
            if(p!=-1){
                if(p>p0+1) {
                    count++;
                }
                p++;
            }
        }
        System.out.println("The count of words: "+count);
        in.close();
    }
}

