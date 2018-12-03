package jeapordy;

import java.io.*;
import java.util.*;

public class Question {
	public void inputQuestions(String file) throws IOException, FileNotFoundException {
        Scanner inF = new Scanner(new File(file));
        while (inF.hasNextLine()) {
			String author = inF.nextLine();
			String title = inF.nextLine();
			int publishYear = inF.nextInt();
			if (inF.hasNextLine()) {
				inF.nextLine();
			}
		}
        inF.close();
	}
}
