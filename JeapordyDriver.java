package jeopardy;

import java.util.*;
import java.io.*;

public class JeapordyDriver {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		ArrayList<Question> questions = new ArrayList<Question>();
		FrontEndGarbo feg = new FrontEndGarbo();
		feg.inputName();
		feg.beginningPanel(questions);
		feg.inputQuestions("jeopardyTextFile", questions);
	}
}
