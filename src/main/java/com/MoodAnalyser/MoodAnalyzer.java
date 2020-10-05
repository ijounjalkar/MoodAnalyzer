package com.MoodAnalyser;
public class MoodAnalyzer {
		public String message;

		public MoodAnalyzer() {                          // default constructor

		}

		public MoodAnalyzer(String message) {           // parameterized constructor
			this.message = message;                     //UC1
		}

		public static void main(String[] args) {

			MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);

			System.out.println("Mood of a person is: " + moodanalyzer.analyseMood());
		}

		public String analyseMood() {
			try {
				if (message.toLowerCase().contains("sad"))
					return "SAD";
				else
					return "HAPPY";
			} catch (NullPointerException e) {                     //Null input exception
				return "HAPPY";
			}
			

		}


}
