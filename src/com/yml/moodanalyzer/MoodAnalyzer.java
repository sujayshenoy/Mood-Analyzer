package com.yml.moodanalyzer;

public class MoodAnalyzer {
    
    public String analyzeMood(String message) {
        if (message.toUpperCase().contains("SAD")) {
            return "SAD";
        }
        else
            return "HAPPY";
    }
}
