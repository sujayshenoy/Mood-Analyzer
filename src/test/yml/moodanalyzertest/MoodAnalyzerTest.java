package test.yml.moodanalyzertest;

import com.yml.moodanalyzer.MoodAnalyzer;
import com.yml.moodanalyzer.MoodAnalyzerException;
import com.yml.moodanalyzer.MoodAnalyzer.Errors;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    /**
     * Test case to check if mood is SAD
     */
    @Test
    public void sadTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        try {
            String actual = moodAnalyzer.analyzeMood();
            String expected = "SAD";
            Assert.assertEquals(expected, actual);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test case to check if mood is HAPPY
     */
    @Test
    public void happyTest() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
            String actual = moodAnalyzer.analyzeMood();
            String expected = "HAPPY";
            Assert.assertEquals(expected, actual);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test case to check for null mood
     */
    @Test
    public void nullTest() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            String actual = e.getMessage();
            String expected = Errors.NULL_MOOD.toString();
            Assert.assertEquals(expected, actual);
        }
    }
    
    /**
     * Test case to check for empty mood
     */
    @Test
    public void emptyTest() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyzerException e) {
            String actual = e.getMessage();
            String expected = Errors.EMPTY_MOOD.toString();
            Assert.assertEquals(expected, actual);
        }
    }


}
