package test.yml.moodanalyzertest;

import com.yml.moodanalyzer.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    /**
     * Test case to check if mood is SAD
     */
    @Test
    public void sadTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "SAD";
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test case to check if mood is HAPPY
     */
    @Test
    public void happyTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test case to check for null mood
     */
    @Test
    public void nullTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actual = moodAnalyzer.analyzeMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);
    }
}
