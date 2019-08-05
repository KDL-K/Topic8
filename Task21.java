package com.shevlik.Topic8;

public class Task21 {
    public static void main(String[] args){
        String str="Hello";
        StringBuffer sb=new StringBuffer((str));
        long n=100000L;
        long startStr;
        long endStr;
        long startSb;
        long endSb;
        startStr=System.nanoTime();
        for(long i=0;i<n;i++){
            str+="World!!!";
        }
        endStr=System.nanoTime();
        startSb=System.nanoTime();
        for(long i=0;i<n;i++){
            sb=sb.append("World!!!");
        }
        endSb=System.nanoTime();
        System.out.println("Сложение строк StringBuffer быстрее String в "+((endStr-startStr)/(endSb-startSb))+" раз.");
    }
}
