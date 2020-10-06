package com.MoodAnalyser;

import static org.junit.Assert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {
	public static MoodAnalyzer moodanalyzer;

	@Test
	void givenMessage_whensad_returnSadMood() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad Mood");
		String testcase1 = "I am in Sad Mood";
		try {
			testcase1 = moodanalyzer.analyseMood();
		} catch (MoodAnalyzerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("SAD", testcase1);
	}

	@Test
	void givenMessage_whenAnyMood_returnHAPPY() {
		MoodAnalyzer moodanalyzerobj1 = new MoodAnalyzer("I am Happy Mood");
		try {
			assertEquals("HAPPY", moodanalyzerobj1.analyseMood());
		} catch (MoodAnalyzerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void givenMessage_whenNull_shouldThrow_MoodAnalyzerException() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
	        Assertions.assertThrows(MoodAnalyzerException.class,() -> {
	        	moodanalyzer.analyseMood();
	            
	        } ) ;
	    }
	@Test
	void givenMessage_whenEmpty_shouldThrow_MoodAnalyzerException() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("");
	        Assertions.assertThrows(MoodAnalyzerException.class,() -> {
	        	moodanalyzer.analyseMood();
	            
	        } ) ;
	    }
			
		
		
	}
