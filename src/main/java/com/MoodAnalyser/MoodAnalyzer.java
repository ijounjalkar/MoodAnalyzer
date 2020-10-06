package com.MoodAnalyser;

public class MoodAnalyzer {
		public String message;

		public MoodAnalyzer() {                          // default constructor

		}

		public MoodAnalyzer(String message) {           // parameterized constructor
			this.message = message;                     
		}

		public static void main(String[] args) throws MoodAnalyzerException {

			MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
			System.out.println("Mood of a person is: " + moodanalyzer.analyseMood());
		}
			

		public String analyseMood() throws MoodAnalyzerException {
			InvalidInput input1 = InvalidInput.NULL;
			InvalidInput input2 = InvalidInput.EMPTY;
			
			try {
				if (message.toLowerCase().contains("sad"))
					return "SAD";
			} catch (NullPointerException e) {                     //null
				MoodAnalyzerException moodanalyzerexception = new MoodAnalyzerException("Mood of a person can't be: " + input1);
				throw moodanalyzerexception;                                                                                      
			}
			if (message == "") 
				throw new MoodAnalyzerException("Mood of a person can't be: " + input2);
			return "HAPPY";
		}


}
