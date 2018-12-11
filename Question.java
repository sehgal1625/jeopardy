package jeapordy;

import java.io.*;
import java.util.*;

/**
 *	Constructor
 *	Input Text File Contents
 *	
 */
public class Question {
	private String category;
	private int points;
	private String question;
	private String answer;
	public Question(String category, int points, String question, String answer){
		this.category = category;
		this.points = points;
		this.question = question;
		this.answer = answer;
	}
	public void inputQuestions(String file, ArrayList<Question> a) throws IOException, FileNotFoundException {
        Scanner inF = new Scanner(new File(file));
        while (inF.hasNextLine()) {
			String category = inF.nextLine();
			int points = inF.nextInt();
			inF.nextLine();
			String question = inF.nextLine();
			String answer = inF.nextLine();
			a.add(new Question(category, points, question, answer));
		}
        inF.close();
	}
}
