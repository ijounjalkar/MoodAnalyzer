package com.MoodAnalyser;


import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class MoodAnalyzerTest {

		public static MoodAnalyzer moodanalyzer;

		@Test
		void givenMessage_whensad_returnSadMood() {
			MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad Mood");
			String testcase1 = moodanalyzer.analyseMood();
            assertEquals("SAD", testcase1);
		}

		@Test
		void givenMessage_whenAnyMood_returnHAPPY() {
			MoodAnalyzer moodanalyzerobj1 = new MoodAnalyzer("I am Happy Mood");
			assertEquals("HAPPY", moodanalyzerobj1.analyseMood());
		}

		@Test
		void givenMessage_whenNullException_returnHAPPY() {
			
			MoodAnalyzer moodanalyzerobj1 = new MoodAnalyzer(null);
		    String result = moodanalyzerobj1.analyseMood();
		    assertEquals("HAPPY", result);
		}
		

}
