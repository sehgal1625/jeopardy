package jeopardy;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class BackEndGarbo {
	
	public static int turns = 0;
	public Question chosenQuestion = new Question();
	
	public JPanel questionPanel(ArrayList<Question> questionList, String category, int pointValue) {
		JPanel questionPanel = new JPanel();
		questionPanel.setSize(600, 400);
		
		JPanel answerPanel = new JPanel();
		
		for(int i = 0; i<questionList.size(); i++) {
			Question questionStats = questionList.get(i);
			if(questionStats.getCategory().equals(category) && questionStats.getPoints() == pointValue) {
				chosenQuestion = new Question(category, pointValue, questionStats.getQuestion(), questionStats.getAnswer());
			}
		}
		
		JLabel question1 = new JLabel(chosenQuestion.getQuestion(), JLabel.CENTER);
		question1.setSize(100, 100);
		question1.setLocation(95, 45);
		
		JLabel cat1 = new JLabel(category, JLabel.CENTER);
		cat1.setSize(100, 100);
		cat1.setLocation(105, 65);
		
		JLabel points = new JLabel("(" + pointValue + ")", JLabel.CENTER);
		points.setSize(100, 100);
		points.setLocation(125, 85);
		
		JTextArea answerField = new JTextArea("Enter Answer Here");
		
		JButton enterAnswer = new JButton("Enter Answer");
		points.setSize(100, 30);
		points.setLocation(95, 45);
		
		questionPanel.add(cat1);
		questionPanel.add(points);
		questionPanel.add(question1);
		questionPanel.add(answerField);
		questionPanel.add(enterAnswer);
		
		JButton goOnButton = new JButton("Next");
		
		enterAnswer.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  answerPanel.setVisible(false);
				  turns +=1;
			  }
		});
		
		enterAnswer.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  questionPanel.removeAll();
				  if(answerField.getText().equalsIgnoreCase(chosenQuestion.getAnswer())) {
					    answerPanel.setBackground(Color.green);
						JLabel correctMessage = new JLabel("You are correct!", JLabel.CENTER);
						
						answerPanel.add(correctMessage);
						answerPanel.add(goOnButton);

				  }
				  else {
					  answerPanel.setBackground(Color.red);
					  JLabel incorrectMessage = new JLabel("You are incorrect :("); 
					  JButton goOnButton = new JButton("Next");
					  
					  answerPanel.add(incorrectMessage);
					  answerPanel.add(goOnButton);
				  }
			}
		});
		return questionPanel;
	}

}
		