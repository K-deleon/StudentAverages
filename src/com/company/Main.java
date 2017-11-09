package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

    Scanner sf = new Scanner(new File("src/com/company/StudentScores.in"));

    int maxIndx = -1;
    String text[] = new String[1000];

    while(sf.hasNext()){
        maxIndx++;
        text[maxIndx] = sf.nextLine();
    }
    sf.close();

    for (int  j = 0; j <= maxIndx; j++){
        Scanner sc = new Scanner(text[j]);

        String firstName = sc.next();

        int sum = 0;
        int amount = 0;
        int average = 0;

        while(sc.hasNext()){
            int i = sc.nextInt();
            sum = sum + i;
            amount++;
            average = sum/amount;

        }

        System.out.println(firstName + ", average = " + average);
    }






    }
}
