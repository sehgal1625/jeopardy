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
	
	private int person1Points;
	private int person2Points;
	
	public JPanel questionPanel(ArrayList<Question> questionList, String category, int pointValue, JPanel myPanel, JFrame a, JLabel one, JLabel two) {
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
		
		JTextArea answerField = new JTextArea("Enter Answer here\nMake sure it is in the form of a question, or it will be wrong.");
		
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
				  answerPanel.removeAll();
				  questionPanel.setVisible(false);
				  if(answerField.getText().equalsIgnoreCase(chosenQuestion.getAnswer())) {
					    answerPanel.setBackground(Color.green);
						JLabel correctMessage = new JLabel("You are correct!", JLabel.CENTER);
						
						answerPanel.add(correctMessage);
						answerPanel.add(goOnButton);
						if(turns % 2 == 0) {
							person1Points += pointValue;
						}
						if(turns % 2 == 1) {
							person2Points += pointValue;
						}
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

	/**
	 * @return the person1Points
	 */
	public int getPerson1Points() {
		return person1Points;
	}

	/**
	 * @param person1Points the person1Points to set
	 */
	public void setPerson1Points(int person1Points) {
		this.person1Points = person1Points;
	}

	/**
	 * @return the person2Points
	 */
	public int getPerson2Points() {
		return person2Points;
	}

	/**
	 * @param person2Points the person2Points to set
	 */
	public void setPerson2Points(int person2Points) {
		this.person2Points = person2Points;
	}
}
		