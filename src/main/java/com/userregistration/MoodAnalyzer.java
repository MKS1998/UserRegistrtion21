package com.userregistration;

public class MoodAnalyzer {
    public static String analyseMood(String mood) {
        if (mood.toLowerCase().contains("Happy")) {
            return "Entry Successfully";
        } else if (mood.toLowerCase().contains("Sad")) {
            return "Entry Failed";
        } else return null;
    }
}