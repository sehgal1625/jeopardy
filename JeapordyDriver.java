package jeapordy;

import java.util.ArrayList;
import java.io.*;

public class JeapordyDriver {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		ArrayList<Question> questions = new ArrayList<Question>();
		FrontEndGarbo feg = new FrontEndGarbo();
		feg.startWindow();
		//feg.inputQuestions("jeopardyTextFile", questions);
		
	}
}
