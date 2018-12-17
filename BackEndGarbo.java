package jeopardy;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class BackEndGarbo {
	
	public static int turns = 0;
	public Question chosenQuestion = new Question();
	JPanel answerPanel = new JPanel();
	
	public JPanel questionPanel(ArrayList<Question> questionList, String category, int pointValue, JPanel myPanel, JFrame a) {
		JPanel questionPanel = new JPanel();
		questionPanel.setSize(600, 400);
		
		for(int i = 0; i<questionList.size(); i++) {
			Question questionStats = questionList.get(i);
			if(questionStats.getCategory().equals(category) && questionStats.getPoints() == pointValue) {
				chosenQuestion = new Question(category, pointValue, questionStats.getQuestion(), questionStats.getAnswer());
			}
		}
		
		JLabel question1 = new JLabel(chosenQuestion.getQuestion(), JLabel.CENTER);
		
		JLabel cat1 = new JLabel(category, JLabel.CENTER);
		
		JLabel points = new JLabel("(" + pointValue + ")", JLabel.CENTER);
		
		JTextArea answerField = new JTextArea("Enter Answer Here");
		
		JButton enterAnswer = new JButton("Enter Answer");
		
		questionPanel.add(cat1);
		questionPanel.add(points);
		questionPanel.add(question1);
		questionPanel.add(answerField);
		questionPanel.add(enterAnswer);
		
		JButton goOnButton = new JButton("Next");
		
		goOnButton.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  answerPanel.setVisible(false);
				  turns +=1;
				  myPanel.setVisible(true);
			  }
		});
		
		enterAnswer.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				  questionPanel.setVisible(false);
				  if(answerField.getText().equalsIgnoreCase(chosenQuestion.getAnswer())) {
					    answerPanel.setBackground(Color.green);
						JLabel correctMessage = new JLabel("You are correct!", JLabel.CENTER);
						
						answerPanel.add(correctMessage);
						answerPanel.add(goOnButton);
						
				  }
				  else {
					  answerPanel.setBackground(Color.red);
					  JLabel incorrectMessage = new JLabel("You are incorrect :("); 
					  JLabel youEntered = new JLabel("You entered: " + answerField.getText());
					  JLabel actualAnswer = new JLabel("The correct answer is: " + chosenQuestion.getAnswer());
					  
					  answerPanel.add(incorrectMessage);
					  answerPanel.add(youEntered);
					  answerPanel.add(actualAnswer);
					  answerPanel.add(goOnButton);
				  }
				  
				  answerPanel.setLayout(new GridLayout(5,4));
				  a.add(answerPanel);
				  answerPanel.setVisible(true);
			}
		});
		return questionPanel;
	}

}
		