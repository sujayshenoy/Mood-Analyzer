package com.yml.moodanalyzer;

/**
 * @author Sujay Shenoy
 * This class holds methods to analyze mood based on message provided
 */
public class MoodAnalyzer {
    String message;
    
    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * @return String
     * This method analyzes mood based on message provided
     */
    public String analyzeMood() {
        try{
            if (message.toUpperCase().contains("SAD")) {
                return "SAD";
            }
            else{
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        
    }
}
