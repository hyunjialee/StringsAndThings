package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String phrase1 = "Is this not";
        String lookFor1 = "is";
        String lookFor2 = "not";
        Pattern pattern1 = Pattern.compile("is",Pattern.CASE_INSENSITIVE );
        Pattern pattern2 = Pattern.compile("not", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(phrase1);
        Matcher matcher2 = pattern2.matcher(phrase1);

        int counter1 = 0;
        int counter2 = 0;
        while(matcher1.find()) {
            counter1++;
        }
        while(matcher2.find()){
            counter2++;
        }
        if(counter1 == counter2){
            System.out.println("true");;
        }
            System.out.println("false");
    }

}