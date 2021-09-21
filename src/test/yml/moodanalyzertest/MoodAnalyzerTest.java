package test.yml.moodanalyzertest;

import com.yml.moodanalyzer.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actual = moodAnalyzer.analyzeMood("I am in Sad Mood");
        String expected = "SAD";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void happyTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actual = moodAnalyzer.analyzeMood("I am in Any Mood");
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);
    }
}
