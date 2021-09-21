package com.yml.moodanalyzer;

/**
 * @author Sujay Shenoy
 * This class holds methods to analyze mood based on message provided
 */
public class MoodAnalyzer {
    String message;

    public static enum Errors {
        EMPTY_MOOD, NULL_MOOD
    }
    
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
    public String analyzeMood() throws MoodAnalyzerException{
        try {
            if (message.length() == 0) {
                throw new MoodAnalyzerException(Errors.EMPTY_MOOD.toString());
            }

            if (message.toUpperCase().contains("SAD")) {
                return "SAD";
            }
            else{
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(Errors.NULL_MOOD.toString());
        }
        
    }
}
