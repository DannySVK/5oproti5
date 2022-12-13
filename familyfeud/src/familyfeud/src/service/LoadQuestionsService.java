package familyfeud.src.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LoadQuestionsService {
	
	private static Map<String, List<AnswerAndNumbers>> questionsMap = new HashMap<String, List<AnswerAndNumbers>>();
	
	public static class AnswerAndNumbers {
		public String answer;
		public int nrOfAnswers;
		
		private AnswerAndNumbers(String answer, String nrOfAnswers) {
			this.answer = answer;
			this.nrOfAnswers = Integer.parseInt(nrOfAnswers);
		}
		
		@Override
		public String toString() {
			return answer + " " + nrOfAnswers;
		}
	}
	
	public static void loadQuestions() throws FileNotFoundException {
		File questions = new File("resources/questions.txt");
		
		Scanner bis = new Scanner(questions);
		
		while (bis.hasNextLine()) {
			String question = bis.nextLine();
			String[] answers = bis.nextLine().split(";");
			String[] nrOfAnswers = bis.nextLine().split(";");
			
			List<AnswerAndNumbers> listAnswerAndNr = new ArrayList<>();
			for (int i = 0; i < answers.length; i++) {
				if (answers[i].trim().equals("!")) {
					continue;
				}
				listAnswerAndNr.add(new AnswerAndNumbers(answers[i].trim(), nrOfAnswers[i].trim()));
			}
			
			questionsMap.put(question.trim(), listAnswerAndNr);
		}
	}
	
	public static Map<String, List<AnswerAndNumbers>> getQuestionsMap() {
		return questionsMap;
	}
}
