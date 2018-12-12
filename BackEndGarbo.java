package jeopardy;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class BackEndGarbo {
	public JPanel questionPanel(ArrayList<Question> questionList, String category, int pointValue) {
		JPanel questionPanel = new JPanel();
		String question = "";
		
		for(int i = 0; i<questionList.size(); i++) {
			Question questionStats = questionList.get(i);
			if(questionStats.getCategory().equals(category) && questionStats.getPoints() == pointValue) {
				question = questionStats.getQuestion();
			}
		}
		
		JLabel question1 = new JLabel(question);
		JLabel cat1 = new JLabel(category);
		JLabel points = new JLabel("" + pointValue);
		JTextArea answerField = new JTextArea("Enter Answer Here");
		JButton enterAnswer = new JButton("Enter Answer");
		
		questionPanel.add(cat1);
		questionPanel.add(points);
		questionPanel.add(question1);
		questionPanel.add(answerField);
		questionPanel.add(enterAnswer);
		
		enterAnswer.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  for(int i = 0; i<questionList.size(); i++) {
						Question questionStats = questionList.get(i);
						if(questionStats.getCategory().equals(category)) {
							
						}
			  }
			}
		});
		return questionPanel;
	}
}

