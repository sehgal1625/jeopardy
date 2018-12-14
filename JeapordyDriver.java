package jeopardy;

import java.util.*;
import java.io.*;

public class JeapordyDriver {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		ArrayList<Question> questions = new ArrayList<Question>();
		FrontEndGarbo feg = new FrontEndGarbo();
		feg.inputQuestions("jeopardyTextFile", questions);
		feg.startWindow(questions);		
	}
}
