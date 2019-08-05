package com.shevlik.Topic8;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Input string: ");
        String str=in.nextLine();
        int count=0;
        int size=str.length();
        for(int i=0;i<size;i++){
            switch (str.charAt(i)){
                case ',':
                case '.':
                case ';':
                case ':':
                case '!':
                case '?':
                    count++;
                    break;
            }
        }
        System.out.println("The count of punctuation marks: "+count);
        in.close();
    }
}
