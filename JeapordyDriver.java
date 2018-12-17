package jeopardy;

import java.util.*;
import java.io.*;

public class JeapordyDriver {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Player One's Name: ");
		String p1Name = kb.nextLine();
		System.out.print("Enter Player Two's Name: ");
		String p2Name = kb.nextLine();
		ArrayList<Question> questions = new ArrayList<Question>();
		FrontEndGarbo feg = new FrontEndGarbo();
		feg.inputQuestions("jeopardyTextFile", questions);
		feg.startWindow(questions);
	}
}
