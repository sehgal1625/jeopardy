package jeopardy;

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
	public String toString() {
		String str = "";
		str += "Category: " + category;
		str += "\nPoint Value: " + points;
		str += "\nQuestion: " + question;
		str += "\nAnswer " + answer;
		return str;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
